package 第2阶段._3_集合._2_Collections工具类.Collections常用方法;

import java.util.ArrayList;
import java.util.Collections;

// 需求: 使用Collections的sort(List<?> list), reverse(List<T> list), shuffle(List<T> list) 方法
/*
    public static <T extends Comparable<? super T>>  void sort(List<T> list):
        将指定的列表按升序排序
    public static void reverse(List<?> list)
        反转列表中元素顺序
    public static void shuffle(List<?> list)
        使用默认的随机源随机排序列表
*/
public class CollectionsDemo {
    public static void main(String[] args) {
        ArrayList<String> array = new ArrayList<>();

        array.add("aaa");
        array.add("ccc");
        array.add("bbb");

        //sort()方法     排序方法
        Collections.sort(array);
        System.out.println(array);

        //reverse()方法  反转方法
        Collections.reverse(array);
        System.out.println(array);

        //shuffle()方法  随机排序
        Collections.shuffle(array);
        System.out.println(array);

    }
}
