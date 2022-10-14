目录:
    
#json基础语法
[json基本语法](main/webapp/_1_jsonBasic.html)

    情况说明:
        json值的数据类型:
            数字:     123456
            字符串:   "123456"
            逻辑值:    true / false
            数组:     ["上海", "北京", "西安"]
            对象:     {...}
            null:     null
    内容:
        1. 定义json:
            var json = {
                "username" : "zhangsan",
                "age" : 23,
                "addr" : ["上海", "北京", "西安"]
            };
        

#json数据和java对象的相互转化
    情况说明:
        1. Fastjson
            说明: 是阿里巴巴编写的高性能功能完善的json库, 是目前java语言中最快的json库
            maven坐标:
                <dependency>
                    <groupId>com.alibaba</groupId>
                    <artifactId>fastjson</artifactId>
                    <version>1.2.62</version>
                </dependency>
    内容:
        json和java对象的转化:
            0. 导入maven坐标
                <dependency>
                    <groupId>com.alibaba</groupId>
                    <artifactId>fastjson</artifactId>
                    <version>1.2.62</version>
                </dependency>
            1. java对象转json
                String jsonStr = JSON.toJSONString(obj);
            2. json字符串转java对象
                User user = JSON.parseObject(jsonStr, User.class);