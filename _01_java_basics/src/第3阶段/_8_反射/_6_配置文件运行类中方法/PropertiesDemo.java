package 第3阶段._8_反射._6_配置文件运行类中方法;


import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;

public class PropertiesDemo {
    public static void main(String[] args) throws IOException, ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Properties prop = new Properties();
        FileReader fr = new FileReader("src\\第3阶段\\反射\\配置文件运行类中方法\\set.properties");
        prop.load(fr);
        fr.close();

        String className = prop.getProperty("className");                                //类的变量名
        String method = prop.getProperty("method");                                      //方法的变量名

        Class<?> cls = Class.forName("第3阶段.反射.配置文件运行类中方法." + className);        //反射配置类
        Constructor<?> con = cls.getConstructor();
        Object obj = con.newInstance();                                                 //反射对象

        Method met = cls.getMethod(method);                                             //反射调用方法
        met.invoke(obj);
    }
}
