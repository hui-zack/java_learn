package service;

import mapper.BrandMapper;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import pojo.Brand;
import util.SqlSessionFactoryUtils;

import java.util.List;

public class BrandService {
    SqlSessionFactory factory = SqlSessionFactoryUtils.getSqlSessionFactory();


    /**
     * 查询所有
     * @return
     */
    public List<Brand> selectAll(){
        //1. 获取SqlSession
        SqlSession sqlSession = factory.openSession();
        //2. 内存加载BrandMapper
        BrandMapper mapper = sqlSession.getMapper(BrandMapper.class);
        //3. 调用方法
        List<Brand> brands = mapper.selectAll();

        sqlSession.close();

        return brands;
    }

    /**
     * 添加
     * @param brand
     */
    public void add(Brand brand){
        //1. 获取SqlSession
        SqlSession sqlSession = factory.openSession();
        //2. 内存加载BrandMapper
        BrandMapper mapper = sqlSession.getMapper(BrandMapper.class);
        //3. 调用方法
        mapper.add(brand);

        //提交事务
        sqlSession.commit();
        //释放资源
        sqlSession.close();

    }



    /**
     * 根据id查询
     * @return
     */
    public Brand selectById(int id){
        //1. 获取SqlSession
        SqlSession sqlSession = factory.openSession();
        //2. 内存加载BrandMapper
        BrandMapper mapper = sqlSession.getMapper(BrandMapper.class);
        //3. 调用方法
        Brand brand = mapper.selectById(id);

        sqlSession.close();

        return brand;
    }


    /**
     * 修改
     * @param brand
     */
    public void update(Brand brand){
        //1. 获取SqlSession
        SqlSession sqlSession = factory.openSession();
        //2. 内存加载BrandMapper
        BrandMapper mapper = sqlSession.getMapper(BrandMapper.class);
        //3. 调用方法
        mapper.update(brand);

        //提交事务
        sqlSession.commit();
        //释放资源
        sqlSession.close();
    }

    /**
     * 根据id删除
     * @param brand
     */
    public void deleteByid(Brand brand){
        //1. 获取SqlSession
        SqlSession sqlSession = factory.openSession();
        //2. 内存加载BrandMapper
        BrandMapper mapper = sqlSession.getMapper(BrandMapper.class);
        //3. 调用删除方法
        mapper.deleteById(brand);

        //提交事务
        sqlSession.commit();
        sqlSession.close();
    }
}
