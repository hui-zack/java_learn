package 第3阶段._8_反射._2_反射构造创建对象._1_反射构造创建对象的使用;
//需求: 使用Class类的四种获取构造方法的方法, 和Constructor类的创建对象方法

/*
知识点:
    Class类中用于获取构造方法的方法:
        Constructor<?>[] getConstructors():
            返回所有public构造方法对象的数组
        Constructor<?>[] getDeclaredConstructors():
            返回所有构造方法对象的数组

        Constructor<T>[] getConstructor(Class<?>...parameterTypes):
            返回指定public构造方法的对象
        Constructor<T[] getDeclaredConstructor(Class<?>...parameterTypes):
            返回指定构造方法的对象
    Constructor创建对象方法:
        T newInstance(Object... initargs):
            参数为
*/

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ConstructorDemo {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        //获取Student的Class对象
        Class<?> sc = Class.forName("第3阶段._8_反射._0_获取Class对象.Student");

            //获取Student的构造方法
        // 返回所有public构造方法对象的数组
        Constructor<?>[] cons1 = sc.getConstructors();
        travers(cons1);

        // 返回所有构造方法对象的数组
        Constructor<?>[] cons2 = sc.getDeclaredConstructors();
        travers(cons2);

        // 返回指定public构造方法的对象,
        Constructor<?> con1 = sc.getConstructor();
        System.out.println(con1 + "\n");

        // 返回指定构造方法的对象, 有参构造(String, int)
        Constructor<?> con2 = sc.getDeclaredConstructor(String.class, int.class);
        System.out.println(con2);

        //无参创建对象
        Object s1 = con1.newInstance();
        System.out.println(s1);

;
    }

    //遍历任意数组并输出到控制台
    private static<T> void travers(T[] t){
        for (Object s : t) {
            System.out.println(s);
        }

        System.out.println();
    }
}
