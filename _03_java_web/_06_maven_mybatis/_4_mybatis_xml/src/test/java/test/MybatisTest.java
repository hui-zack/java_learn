package test;

import mapper.BrandMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import pojo.Brand;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class MybatisTest {
    private static final SqlSessionFactory sqlSessionFactory;

    /**
     * 静态代码块加载核心配置文件(进内存时执行一次, 节省资源开销), 获取sqlSession工厂对象
     */
    static {

        String resource = "mybatis-config.xml";
        InputStream inputStream = null;
        try {
            inputStream = Resources.getResourceAsStream(resource);
        } catch (IOException e) {
            e.printStackTrace();
        }
        sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
    }


    /**
     * 1.查询brand所有内容
     */
    @Test
    public void selectAllTest() {
        //1. 获取SqlSession对象
        SqlSession sqlSession = sqlSessionFactory.openSession();

        //2. 获取mapper接口代理对象
        BrandMapper mapper = sqlSession.getMapper(BrandMapper.class);

        //3. 执行方法
        List<Brand> brandList = mapper.selectAll();
        forList(brandList);

        //4. 释放资源
        sqlSession.close();
    }

    /**
     * 2.根据id查询
     */
    @Test
    public void selectByIdTest(){
        SqlSession sqlSession = sqlSessionFactory.openSession();
        BrandMapper mapper = sqlSession.getMapper(BrandMapper.class);

        int id = 1;

        Brand brand = mapper.selectById(id);
        System.out.println(brand);

        sqlSession.close();
    }


    /**
    * 3.1 多条件查询 sql参数传递由注解实现:
     * 查询status为1, companyName包含华为, brandName包含华为的数据
     *     xml: #{status}          ->      @Param("status") int status
     *     xml: #{companyName}     ->      @Param("companyName") String companyName
     *     xml: #{brandName}       ->      @Param("brandName") String BrandName
    * */
    @Test
    public void selectByConditionAnnTest(){
        //1. 接受参数
        int status = 1;
        String companyName = "华为";
        String brandName = "华为";

        //2. 参数处理
        companyName = "%" + companyName + "%";      //* 数据库模糊查询规范
        brandName = "%" + brandName + "%";

        //3. 获取sqlSession对象并加载查询接口
        SqlSession sqlSession = sqlSessionFactory.openSession();
        BrandMapper mapper = sqlSession.getMapper(BrandMapper.class);

        //3. 传递参数查询
        List<Brand> brandList = mapper.selectByCondition(status, companyName, brandName);
        forList(brandList);

        //4. 释放资源
        sqlSession.close();
    }

    /**
     * 3.2 多条件查询 sql参数传递由javaBean对象实现
     * */
    @Test
    public void selectByConditionBeanTest(){
        //1. 接受参数
        int status = 1;
        String companyName = "华为";
        String brandName = "华为";

        //2. 参数处理
        companyName = "%" + companyName + "%";      //* 数据库模糊查询规范
        brandName = "%" + brandName + "%";

        //3. 封装javaBean对象
        Brand brand = new Brand();
        brand.setStatus(status);
        brand.setCompanyName(companyName);
        brand.setBrandName(brandName);

        //4. 获取sqlSession对象并加载查询接口
        SqlSession sqlSession = sqlSessionFactory.openSession();
        BrandMapper mapper = sqlSession.getMapper(BrandMapper.class);

        //5. 传递javaBean对象查询(javaBean携带查询数据),
        List<Brand> brandList = mapper.selectByCondition(brand);
        forList(brandList);

        //6. 释放资源
        sqlSession.close();
    }

    /**
     * 3.3 多条件查询 sql参数传递由Map对象实现
     * */
    @Test
    public void selectByConditionMapTest(){
        //1. 接受参数
        int status = 1;
        String companyName = "华为";
        String brandName = "华为";

        //2. 参数处理
        companyName = "%" + companyName + "%";      //* 数据库模糊查询规范
        brandName = "%" + brandName + "%";

        //3. 封装Map对象
        Map map = new HashMap();
        map.put("status", status);
        map.put("companyName", companyName);
        map.put("brandName", brandName);

        //3. 获取sqlSession对象并加载查询接口
        SqlSession sqlSession = sqlSessionFactory.openSession();
        BrandMapper mapper = sqlSession.getMapper(BrandMapper.class);

        //4. 传递javaBean对象查询(javaBean携带查询数据),
        List<Brand> brandList = mapper.selectByCondition(map);
        forList(brandList);

        //5. 释放资源
        sqlSession.close();
    }

    /**
    * 4.单条件查询
    * */
    @Test
    public void selectByConditionSingleTest(){
        Brand brand = new Brand();
        brand.setCompanyName("%华为%");

        SqlSession sqlSession = sqlSessionFactory.openSession();
        BrandMapper mapper = sqlSession.getMapper(BrandMapper.class);
        List<Brand> brandList = mapper.selectByConditionSingle(brand);
        forList(brandList);

        sqlSession.close();
    }

    /**
    * 5. 添加数据, 并获取主键值
    * */
    @Test
    public void addTest(){
        //1. 封装数据对象
        Brand brand = new Brand();
        brand.setBrandName("百度");
        brand.setCompanyName("百度信息科技有限公司");
        brand.setOrdered(60);
        brand.setDescription("百度paddlePaddle, 无门槛人工智能");
        brand.setStatus(1);

        //2. 获取sqlSession, 加载接口和sql.xml
        SqlSession sqlSession = sqlSessionFactory.openSession(true);        //* 自动提交事务
        BrandMapper mapper = sqlSession.getMapper(BrandMapper.class);

        //3. 添加数据
        mapper.add(brand);

        //4. 获取主键值
        Integer id = brand.getId();
        System.out.println(id);

        //sqlSession.commit();                                                   //* 手动提交事务
        sqlSession.close();
    }

    /**
     * 6 修改数据-动态修改部分字段+全部字段
     * */
    @Test
    public void updateTest(){
        Brand brand = new Brand();
        brand.setBrandName("联想");
        brand.setCompanyName("联想集团有限公司");
        brand.setOrdered(200);
        brand.setDescription("联想, 国产笔记本领导者");
        brand.setStatus(0);
        brand.setId(5);

        SqlSession sqlSession = sqlSessionFactory.openSession(true);
        BrandMapper mapper = sqlSession.getMapper(BrandMapper.class);
        int updateNum = mapper.update(brand);
        System.out.println(String.format("updateNum: %s", updateNum));

        sqlSession.close();
    }

    /**
    * 7.1 删除单条数据
    * */
    @Test
    public void deleteByIdTest(){
        Brand brand = new Brand();
        brand.setId(6);

        SqlSession sqlSession = sqlSessionFactory.openSession(true);
        BrandMapper mapper = sqlSession.getMapper(BrandMapper.class);
        mapper.deleteById(brand);

        sqlSession.close();
    }

    /**
     * 7.2 删除多个数组
     * */
    @Test
    public void deleteByIdsTest(){
        int[] ids = {7, 8, 9, 10, 11, 12, 13};

        SqlSession sqlSession = sqlSessionFactory.openSession(true);
        BrandMapper mapper = sqlSession.getMapper(BrandMapper.class);

        int deleteNum = mapper.deleteByIds(ids);
        System.out.println("deleteNum : " + deleteNum);

        sqlSession.close();
    }


    public void forList(List<Brand> list){
        for (Brand brand : list) {
            System.out.println(brand);
        }
    }
}
