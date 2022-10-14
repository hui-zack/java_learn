package 第2阶段._3_集合._1_Collection集合._3_ArrayList和LinkedList._1_创建集合;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;


//需求: 分别创建ArrayList和LinkedList集合, 添加元素后使用三种方法遍历这两个集合
public class ArrayList和LinkedList {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("hello");
        list.add("world");
        list.add("java");

        //迭代器遍历
        ListIterator<String> lit = list.listIterator();
        while (lit.hasNext()) {
            String s = lit.next();
            System.out.println(s);
        }

        //for循环遍历
        System.out.println();
        for (int i = 0; i < list.size(); i++) {
            String s = list.get(i);
            System.out.println(s);
        }
        System.out.println();
        //增强for循环遍历
        for (String s : list) {
            System.out.println(s);
        }

        System.out.println("------");

        //LinkedList
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("hello");
        linkedList.add("world");
        linkedList.add("java");

        //迭代器遍历
        ListIterator<String> llit = linkedList.listIterator();
        while (llit.hasNext()) {
            String s = llit.next();
            System.out.println(s);
        }

        //for循环遍历
        System.out.println();
        for (int i = 0; i < list.size(); i++) {
            String s = linkedList.get(i);
            System.out.println(s);
        }

        //增强for循环
        System.out.println();
        for (String s : linkedList) {
            System.out.println(s);
        }
    }
}
