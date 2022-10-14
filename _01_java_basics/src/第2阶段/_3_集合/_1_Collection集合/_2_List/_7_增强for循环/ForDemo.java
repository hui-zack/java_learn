package 第2阶段._3_集合._1_Collection集合._2_List._7_增强for循环;

import java.util.ArrayList;
import java.util.List;

//需求: 使用增强for循环遍历数组和集合, 并用并发修改异常验证 增强for循环 是用Iterator实现的
public class ForDemo {
    public static void main(String[] args) {
        // 增强for循环遍历数组
        String[] arr = {"1", "2", "3"};
        for (String s : arr) {
            System.out.println(s);
        }

        //增强for循环遍历集合
        List<String> list = new ArrayList<>();
        list.add("hello");
        list.add("world");
        list.add("java");

        for(String s : list) {
            System.out.println(s);
        }

        //并发修改异常验证增强for循环内部是用Iterator实现
        for(String s : list) {
            list.add("javaee");
        }
    }
}
