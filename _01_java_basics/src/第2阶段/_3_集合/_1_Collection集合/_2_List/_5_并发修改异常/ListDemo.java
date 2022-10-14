package 第2阶段._3_集合._1_Collection集合._2_List._5_并发修改异常;
// 需求: 复现一个使用Iterator时的并发修改异常

import java.util.ArrayList;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("hello");
        list.add("world");
        list.add("java");

        //并发修改异常
        /*
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {              //预期循环次数
            String s = it.next();
            if (s.equals("world")) {
                list.add("javaSE");         //实际循环次数改变了, 所以作者抛出了异常
            }
        }
        */

        //这种循环中该长度的事情 用for循环来实现
        for (int i=0; i<list.size(); i++) {
            String s = list.get(i);
            if (s.equals("world")) {
                list.add("javaSE");
            }
        }

        System.out.println(list);


    }
}
