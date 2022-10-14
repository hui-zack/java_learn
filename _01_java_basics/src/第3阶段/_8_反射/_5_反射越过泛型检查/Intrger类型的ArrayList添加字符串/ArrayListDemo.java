package 第3阶段._8_反射._5_反射越过泛型检查.Intrger类型的ArrayList添加字符串;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        ArrayList<Integer> list = new ArrayList<>();

        Class<? extends ArrayList> cls = list.getClass();
        Method add = cls.getMethod("add", Object.class);
        add.invoke(list, "java");
        add.invoke(list, "world");
        list.add(30);

        System.out.println(list);
    }
}
