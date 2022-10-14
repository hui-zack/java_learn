package mapper;


import org.apache.ibatis.annotations.Param;
import pojo.Brand;

import java.util.List;
import java.util.Map;

public interface BrandMapper {
    /**
     * 1.查询所有数据
     * @return List<Brand>
     */
    List<Brand> selectAll();

    /**
    * 2.根据id查询所有数据
     * @return List<Brand>
    * */
    Brand selectById(int id);

    /**
    * 3.1 条件查询 sql参数传递由注解实现(第一次重载):
     *     查询status为1, companyName包含华为, brandName包含华为的数据
     *          xml: #{status}          ->      @Param("status") int status
     *          xml: #{companyName}     ->      @Param("companyName") String companyName
     *          xml: #{brandName}       ->      @Param("brandName") String BrandName
    * */
    List<Brand> selectByCondition(@Param("status") int status, @Param("companyName") String companyName,
                                  @Param("brandName") String BrandName);

    /**
    * 3.2 条件查询 sql参数传递由javaBean对象实现(第二次重载)
    * */
    List<Brand> selectByCondition(Brand brand);

    /**
     * 3.3 条件查询 sql参数传递由Map对象实现(第三次重载)
     * */
    List<Brand> selectByCondition(Map map);

    /**
     * 4.单条件查询 动态sql
     * */
    List<Brand> selectByConditionSingle(Brand brand);

    /**
    * 5.添加数据
    * */
    void add(Brand brand);

    /**
    * 6.根据id修改数据
    * */
    int update(Brand brand);

    /**
     * 7.1 根据id删除单条数据
     */
    int deleteById(Brand brand);

    /**
     * 7.2 根据id数组删除多条数据
     * */
    int deleteByIds(@Param("ids")int[] ids);

}
