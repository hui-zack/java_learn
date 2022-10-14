package 第2阶段._3_集合._1_Collection集合._2_List._1_List集合;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//需求: 创建一个List集合, 并遍历
public class ListDemo {
    public static void main(String[] args) {
        //创建List集合
        List<String> list = new ArrayList<>();

        list.add("hello");
        list.add("world");
        list.add("java");
        list.add("hello");

        System.out.println("------");
        //下标访问
        System.out.println(list);
        System.out.println(list.get(2));

        System.out.println("------");
        //遍历
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            String s = it.next();
            System.out.println(s);
        }


    }
}
