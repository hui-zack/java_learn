package 第2阶段._3_集合._1_Collection集合._4_Set._1_Set集合.创建set集合并遍历;
//根据实现类HashSet<E> 实现一个set集合, 添加元素并打印到控制台

import java.util.HashSet;
import java.util.Set;

public class SetDemo {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();

        set.add("hello");
        set.add("world");
        set.add("java");
        set.add("hello");

        System.out.println(set);

        //没有索引, 增强for遍历
        for (String s : set) {
            System.out.println(s);
        }
    }
}
