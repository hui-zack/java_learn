#案例:
##准备1:
    '''mysql
    
    CREATE DATABASE IF NOT EXISTS mybatis;
    USE mybatis;
    -- 删除tb_brand表
      drop table if exists tb_brand;
      -- 创建tb_brand表
      create table tb_brand
      (
          -- id 主键
          id           int primary key auto_increment,
          -- 品牌名称
          brand_name   varchar(20),
          -- 企业名称
          company_name varchar(20),
          -- 排序字段
          ordered      int,
          -- 描述信息
          description  varchar(100),
          -- 状态：0：禁用  1：启用
          status       int
      );
      -- 添加数据
      insert into tb_brand (brand_name, company_name, ordered, description, status)
      values ('三只松鼠', '三只松鼠股份有限公司', 5, '好吃不上火', 0),
             ('华为', '华为技术有限公司', 100, '华为致力于把数字世界带入每个人、每个家庭、每个组织，构建万物互联的智能世界', 1),
             ('小米', '小米科技有限公司', 50, 'are you ok', 1);
    ```
## 准备2: 安装MyBatisX插件
    mapper.xml文件中idea无法提示sql语句
    setting 下搜索 sql dislects, 将选项改为mysql
## code:
    详见代码
## MyBatis底层封装源码
    MyBatis接口方法中可以接受各种各样的参数, 是因为MyBatis底层对于这些参数进行了不同的封装处理--ParamNameResolver类
    参数封装原理:
        
        单个参数:           //* 将来都使用@Param注解来修改Map集合中默认的键名, 并使用修改后的名称在sql.xml中获取值 
            1. POJO类型
                直接使用, 属性名和参数占位符(#{xxx})名称一致
            2. Map类型
                直接使用, 键名和参数占位符(#{xxx})名称一致
            3. Collection
                封装为map:
                    map.put("arg0", list集合)
                    map.put("collection", Collection)
            4. List:
                封装为Map:
                    map.put("arg0", list集合)
                    map.put("collection", list集合)
                    map.put("list", list集合)
            5. Array:
                封装为Map:
                    map.put("arg0", 数组)
                    map.put("array", 数组)      
            6. 其他类型
                直接使用
        多个参数, 封装为Map集合, 可以使用@param注解, 替换Map中默认的arg键名