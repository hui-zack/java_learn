package 第3阶段._8_反射._4_反射方法并使用._2_反射方法案例;


import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

//需求: 反射Student类的方法, 并调用
/*
要求:
    使用发射执行如下操作:
        Student s = new Student();
        s.method()
        s.method("林青霞")

        String ss = s.method("林青霞", 30);
        System.out.println(ss);
        s.show(String output);
*/
public class MethodDemo {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Class<?> cls = Class.forName("第3阶段._8_反射._0_获取Class对象.Student");
        Constructor<?> con = cls.getDeclaredConstructor();
        Object obj = con.newInstance();

        Method method1 = cls.getMethod("method", String.class);
        method1.invoke(obj, "林青霞");

        Method method2 = cls.getMethod("method", String.class, int.class);
        String ss = (String) method2.invoke(obj, "林青霞", 30);
        System.out.println(ss);

        Method method3 = cls.getDeclaredMethod("show", String.class);
        method3.setAccessible(true);
        method3.invoke(obj,"java world");
    }
}
