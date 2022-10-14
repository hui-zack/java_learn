package 第2阶段._3_集合._2_Collections工具类.ArrayList存储学生对象并排序案例.Comparator实现;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class CollectionsDemo {
    public static void main(String[] args) {
        ArrayList<Student> array = new ArrayList<>();

        Student s1 = new Student("张辉", 23);
        Student s2 = new Student("曹飞鱼", 21);
        Student s3 = new Student("吴楠", 22);

        array.add(s1);
        array.add(s2);
        array.add(s3);

        Collections.sort(array, new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                int num = s1.getAge() - s2.getAge();
                num = num == 0 ? s1.getName().compareTo(s2.getName()) : num;
                return num;
            }
        });

        Collections.reverse(array);

        for (Student s : array) {
            System.out.println(s);
        }



    }
}
