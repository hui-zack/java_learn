package 第3阶段._8_反射._3_反射变量并赋值._2_反射变量赋值案例;
//需求: 使用class类的四种获取成员变量的方法, 并使用Field类的set(Object obj, Object name)为成员变量赋值

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/*
要求:
    通过反射显示以下操作:
        Student s = new Student();
        s.name = "林青霞";
        s.age = "30";
        s.address = "西安";
        System.out.println(s);
*/
public class FieldDemo {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException, NoSuchFieldException {
        Class<?> cls = Class.forName("第3阶段._8_反射._0_获取Class对象.Student");
        Constructor<?> con = cls.getDeclaredConstructor();
        Object obj = con.newInstance();                                             //创建无参学生对象


        Field nameField = cls.getDeclaredField("name");                       //name变量赋值
        nameField.setAccessible(true);
        nameField.set(obj, "林青霞");

        Field ageField = cls.getDeclaredField("age");                         //age变量赋值
        ageField.setAccessible(true);
        ageField.set(obj, 30);

        Field addressField = cls.getDeclaredField("address");                 //address变量赋值
        addressField.set(obj, "西安");

        System.out.println(obj);
    }
}
