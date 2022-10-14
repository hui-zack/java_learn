package 第2阶段._3_集合._1_Collection集合._2_List._6_ListIterator;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

//需求: 创建List集合, 使用列表迭代器ListIterator遍历集合
public class ListIteratorDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("hello");
        list.add("world");
        list.add("java");


        // 列表迭代器并发增加集合长度
        ListIterator<String> lit = list.listIterator();
        while (lit.hasNext()) {
            String s = lit.next();
            if (s.equals("java")) {
                lit.add("javaee");
            }
        }

        System.out.println(list);
    }
}
