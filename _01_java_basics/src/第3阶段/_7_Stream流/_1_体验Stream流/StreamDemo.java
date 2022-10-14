package 第3阶段._7_Stream流._1_体验Stream流;

import java.util.ArrayList;

public class StreamDemo {
    public static void main(String[] args) {
        ArrayList<String> array = new ArrayList<>();
        array.add("张曼玉");
        array.add("吴亦凡");
        array.add("张辉");
        array.add("张三丰");
        array.add("林青霞");
        array.add("张子栋");


        getResult(array);
        streamResult(array);

    }

    private static void getResult(ArrayList<String>  list) {
        ArrayList<String> list1 = new ArrayList<>();
        for (String s : list) {
            if (s.startsWith("张") && s.length() == 3) {
                list1.add(s);
            }
        }

        for (String s : list1) {
            System.out.println(s);
        }
        System.out.println();
    }

    //stream调用过滤器(filter方法)操作Filter方法, 实现判断接口Predicate, forEach方法实现消费接口Consumer
    private static void streamResult(ArrayList<String> list) {
        list.stream().filter( s -> s.startsWith("张")).filter(s -> s.length() == 3).forEach(System.out::println);
    }
}
