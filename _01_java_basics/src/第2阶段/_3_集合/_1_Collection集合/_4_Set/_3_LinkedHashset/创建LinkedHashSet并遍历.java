package 第2阶段._3_集合._1_Collection集合._4_Set._3_LinkedHashset;

import java.util.LinkedHashSet;

// 需求: 创建LinkedHashSet并遍历
public class 创建LinkedHashSet并遍历 {
    public static void main(String[] args) {
        LinkedHashSet<String> lhs = new LinkedHashSet<String>();

        lhs.add("hello");
        lhs.add("world");
        lhs.add("java");

        for(String s : lhs) {
            System.out.println(s);
        }
    }
}
