package 第2阶段._3_集合._1_Collection集合._1_Collection.Collection集合常用方法;

import java.util.ArrayList;
import java.util.Collection;

// 需求: 多态创建Collection指向Arraylist对象, 调用Collection常用方法
/*
    boolean add(E e);
                添加元素
    boolean contains(Object o);
        判断集合中是否存在指定的元素
    boolean remove(Object o);
        从集合中移除指定的元素
    void clear();
        清空集合中的元素
    boolean isEmpty()
        判断集合是否为空
    int size();
        判断集合的长度
*/
public class CollectionDemo {
    public static void main(String[] args) {
        Collection<String> c = new ArrayList<String>();
        //add()方法
        c.add("hello");
        c.add("world");
        c.add("java");
        System.out.println(c);

        System.out.println("-------------");
        //contains()方法
        System.out.println(c.contains("java"));
        System.out.println(c.contains("javase"));

        System.out.println("-------------");
        //remove()方法
        System.out.println(c.remove("java"));

        System.out.println("-------------");
        //clear()方法
        c.clear();
        System.out.println(c);


        System.out.println("-------------");
        //isEmpty()方法
        System.out.println(c.isEmpty());

        System.out.println("-------------");
        //size()方法
        System.out.println(c.size());

    }
}
