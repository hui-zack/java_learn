package 第3阶段._6_函数式接口._1_使用函数式接口._2_函数式接口作为方法的返回值;
//需求:
//  定义一个类(ComparatorDemo), 类中返回两个方法
//      Comparator<String> getComparator();  方法返回值Comparator是一个函数式接口
//      main, 在主方法中调用getComparator方法

/*

*/

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ComparatorDemo {
    public static void main(String[] args) {
        ArrayList<String> array = new ArrayList<>();
        array.add("aaa");
        array.add("bb");
        array.add("dddd");
        array.add("c");

        System.out.println("排序前" + array);
        Collections.sort(array, getComparator1());
        System.out.println("排序后" + array);
    }
    private static Comparator<String> getComparator1() {

        //创建接口对象实现并返回Comparator<String>
//        Comparator<String> comp = new Comparator<String>() {
//            @Override
//            public int compare(String s1, String s2) {
//                return s1.length() - s2.length();
//            }
//        };
//        return comp;
        //内部类实现并返回Comparator<String>
//        return new Comparator<String>() {
//            @Override
//            public int compare(String s1, String s2) {
//                return s1.length() - s2.length();
//            }
//        };

        //Lambda实现并返回Comparator<String>
        return (s1, s2) -> s1.length() - s2.length();
    }
}
