package 第2阶段._3_集合._1_Collection集合._4_Set._4_TreeSet.TreeSet无参Comparable.元素类实现Comparable接口排序;

import java.util.TreeSet;

public class ComparableDemo {
    public static void main(String[] args) {
        TreeSet<Student> ts = new TreeSet<>();

        Student s1 = new Student("zhangHui", 22);
        Student s2 = new Student("caoFeiYu", 22);
        Student s3 = new Student("wuNam", 21);

        ts.add(s1);
        ts.add(s2);
        ts.add(s3);

        for (Student s : ts) {
            System.out.println(s);
        }

    }


}
