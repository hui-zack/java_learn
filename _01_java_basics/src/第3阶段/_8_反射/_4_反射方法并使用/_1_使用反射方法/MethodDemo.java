package 第3阶段._8_反射._4_反射方法并使用._1_使用反射方法;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class MethodDemo {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, IllegalAccessException, InstantiationException {
        Class<?> cls = Class.forName("第3阶段._8_反射._0_获取Class对象.Student");
        Constructor<?> con = cls.getDeclaredConstructor();
        Object obj = con.newInstance();

        Method[] methods = cls.getDeclaredMethods();
        for (Method method : methods){
            System.out.println(method);
        }

        Method showMethod = cls.getDeclaredMethod("show", String.class);
        showMethod.setAccessible(true);
        showMethod.invoke(obj, "invoke方法");

    }
}
