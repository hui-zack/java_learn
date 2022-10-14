package 第1阶段._3_数组集合和String._3_Arraylist;

import java.util.ArrayList;
import java.util.List;

//需求: 测试ArrayList的常用方法
public class 常用方法 {
    public static void main(String[] args) {

        //.remove(Object o)
        List<String> array = getArray();
        System.out.println(array.remove("world"));
        System.out.println(".remove(Object o): " + array);

        System.out.println("------");

        //.remove(int index)
        List<String> array1 = getArray();
        System.out.println(array1.remove(0));
        System.out.println(".remove(int index): " +array1);

        System.out.println("------");

        //.set(int index, E element)
        List<String> array2 = getArray();
        System.out.println(array2.set(1, "你好"));
        System.out.println(".set(int index, E element): " + array2);

        System.out.println("------");

        //.get(int index)
        List<String> array3 = getArray();
        System.out.println(array3.get(2));
        System.out.println(".get(int index): " + array3);

        System.out.println("------");

        //.size()
        List<String> array4 = getArray();
        System.out.println(array4.size());
        System.out.println(".size(): " + array4);

    }
    // 该方法用于创建集合
    public static List<String> getArray() {
        ArrayList<String> array = new ArrayList<String>();
        array.add("hello");
        array.add("world");
        array.add("java");

        return array;
    }
}
