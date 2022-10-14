package 第3阶段._8_反射._2_反射构造创建对象._2_反射构造创建对象案例.反射创建学生对象1;

import 第3阶段._8_反射._0_获取Class对象.Student;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

// 使用反射获取构造方法并创建学生类的对象
/*
要求:
    通过反射实现如下的操作
        Student s = new Student("林青霞", 30, "西安")
        System.out.println(s)
*/
public class ConstructorDemo1 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Class<?> cs = Class.forName("第3阶段._8_反射._0_获取Class对象.Student");
        Constructor<?> con = cs.getDeclaredConstructor(String.class, int.class, String.class);

        Object s = con.newInstance("林青霞", 30, "西安");
        Student stu = (Student) s;
        System.out.println(stu);
    }

}
