package 第4阶段._2_注解._3_注解解析._1_注解存放属性值并解析;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

//需求: 使用注解存放信息到Demo的类声明上方, 代替配置文件, 实现调用任意类的方法
@ConfigFile(className = "第4阶段.反射搭建框架结构.根据配置文件调用任意方法.People", method = "eat")
public class ConfigFileDemo {
    public static void main(String[] args) throws Exception {
        //获取注解对象
        Class<ConfigFileDemo> cls = ConfigFileDemo.class;
        ConfigFile config = cls.getAnnotation(ConfigFile.class);

        //解析注解, 获取属性值
        String className = config.className();
        String method = config.method();

        //反射配置对象
        Class<?> aClass = Class.forName(className);
        Constructor<?> con = aClass.getDeclaredConstructor();
        con.setAccessible(true);
        Object obj = con.newInstance();

        //反射配置方法
        Method me = aClass.getDeclaredMethod(method);
        me.invoke(obj);

    }
}
