package 第4阶段._3_反射搭建框架结构._3_根据配置文件调用任意方法;

import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;

public class ReflectDemo {
    public static void main(String[] args) throws IOException, ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        //读取文件为map集合
        Properties prop = new Properties();
        FileReader fr = new FileReader("data\\set.txt");
        prop.load(fr);
        fr.close();
/*
        ClassLoader classLoader = ReflectDemo.class.getClassLoader();
        InputStream is = classLoader.getResourceAsStream("set.properties");         //set.properties文件中不能写中文因此不能用
        prop.load(is);
        System.out.println(prop);
*/

        //获取配置内容
        String className = prop.getProperty("className");
        String method = prop.getProperty("method");


        Class<?> cls = Class.forName(className);

        Constructor<?> con = cls.getDeclaredConstructor();
        con.setAccessible(true);
        Object obj = con.newInstance();

        Method me = cls.getDeclaredMethod(method);
        me.setAccessible(true);
        me.invoke(obj);
    }
}
