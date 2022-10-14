package 第3阶段._8_反射._3_反射变量并赋值._1_反射变量赋值的使用;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

//需求: 使用class类的四种获取成员变量的方法, 并使用Field类的set(Object obj, Object name)为成员变量赋值
/*
知识点:
    Class类中用于获取成员变量的方法
        Field[] getFields():
            返回 所有public成员变量对象的数组
        Field[] getDeclaredFields():
            返回 所有成员变量对象的数组
        Field[] getField(String name):
            返回 指定的public成员变量的对象
        Field[] getField(String name):
            返回 指定的成员变量的对象
            参数为成员变量的名称
    Field类给为获取的成员变量赋值方法:
        void set(Object obj, Object value):
            给obj对象的成员变量赋值为value
            注意这个这个obj对象必须是一个getField已获取的成员变量的对象
*/
public class FiledDemo {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException, NoSuchFieldException {
        Class<?> cs = Class.forName("第3阶段._8_反射._0_获取Class对象.Student");

        Constructor<?> con1 = cs.getDeclaredConstructor();                  //获取构造对象
        con1.setAccessible(true);                                           //开启暴力反射
        Object obj = con1.newInstance();                                    //创建对象

        Field nameField = cs.getDeclaredField("name");
        nameField.setAccessible(true);
        nameField.set(obj, "张辉");


        Field addressField = cs.getDeclaredField("address");          //获取成员变量对象
        addressField.set(obj, "太原");                                       //成员变量赋值

        System.out.println(obj);


    }
}
