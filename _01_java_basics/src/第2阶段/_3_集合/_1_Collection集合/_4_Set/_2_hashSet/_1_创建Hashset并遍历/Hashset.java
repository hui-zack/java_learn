package 第2阶段._3_集合._1_Collection集合._4_Set._2_hashSet._1_创建Hashset并遍历;

import java.util.HashSet;

// 创建一个hashset集合
public class Hashset {
    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<String>();

        hs.add("hello");
        hs.add("world");
        hs.add("java");
        System.out.println(hs);

        //增强for遍历
        for (String s : hs) {
            System.out.println(s);
        }
    }
}
