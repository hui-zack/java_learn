package 第3阶段._6_函数式接口._2_常用的函数式接口._3_数据判断接口Predicate.Predicate接口实现字符串切片分别判断;

import java.util.ArrayList;
import java.util.function.Predicate;

public class PredicateDemo {
    public static void main(String[] args) {
        String[] strArray = {"林青霞, 30", "张曼玉, 35", "王祖贤, 33"};
        ArrayList<String> array = myFilter(strArray, s -> s.split(",")[0].length() > 2, s -> Integer.parseInt(s.split(", ")[1]) > 33);
        System.out.println(array.toString());
    }

    private static ArrayList<String> myFilter(String[] strArray, Predicate<String> pre1, Predicate<String> pre2) {
        ArrayList<String> array = new ArrayList<>();
        for (String str : strArray) {
            if (pre1.and(pre1).test(str)) {
                array.add(str);
            }
        }

        return array;
    }
}
