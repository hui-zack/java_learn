package 第3阶段._8_反射._2_反射构造创建对象._2_反射构造创建对象案例.反射创建学生对象2;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

//需求: 使用反射创建要求的学生对象, 使用暴力反射
/*
要求:
    通过反射实现如下操作
        Student s = new Student("林青霞")   -->这个是私有构造方法
        System.out.println("S")
*/

public class ConstructorDemo2 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Class<?> cs = Class.forName("第3阶段._8_反射._0_获取Class对象.Student");

        Constructor<?> con1 = cs.getDeclaredConstructor(String.class);  //获取构造对象
        con1.setAccessible(true);                                       //开启暴力反射
        Object o = con1.newInstance("林清霞");
        System.out.println(o);

    }
}
