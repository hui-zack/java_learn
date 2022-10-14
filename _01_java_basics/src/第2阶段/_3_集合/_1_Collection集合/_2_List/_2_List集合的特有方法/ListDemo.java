package 第2阶段._3_集合._1_Collection集合._2_List._2_List集合的特有方法;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// 需求: 创建一个List集合, 使用List集合的特有特有方法, 并使用循环遍历集合
public class ListDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();

        list.add("hello");
        list.add("world");
        list.add("java");

        System.out.println("------");
        //add(int index, E element)方法
        list.add(3, "javaee");
        System.out.println(list);

        System.out.println("------");
        //remove(int index)方法
        list.remove((3));
        System.out.println(list);

        System.out.println("------");
        //set(int index, E element)方法
        list.set(0, "hellohello");
        System.out.println(list);

        System.out.println("------");
        //get(int index)方法
        list.get(1);
        System.out.println(list);

        System.out.println("------");
        //循环遍历
        for (int i = 0; i < list.size(); i++) {
            String s = list.get(i);
            System.out.println(s);
        }

        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            String s = it.next();
            System.out.println(s);
        }
    }
}
