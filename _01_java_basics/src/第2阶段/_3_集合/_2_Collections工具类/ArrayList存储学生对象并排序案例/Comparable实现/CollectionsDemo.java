package 第2阶段._3_集合._2_Collections工具类.ArrayList存储学生对象并排序案例.Comparable实现;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

//需求: 创建一个ArrayList集合, 存储学生对象, 使用Collection对ArrayList进行排序
//      要求: 按照年龄大到小进行排序, 年龄相同时, 按住奥姓名的字母顺序进行排序
/*
    (1) 创建学生对象
    (2) 创建ArrayList对象
    (3) 创建集合对象
    (4) 把学生条件到集合
    (5) 使用Collections对ArrayList集合配许
    (6) 遍历集合
*/
public class CollectionsDemo {
    public static void main(String[] args) {
        ArrayList<Student> array = new ArrayList<>();

        Student s1 = new Student("张辉", 23);
        Student s2 = new Student("曹飞鱼", 21);
        Student s3 = new Student("吴楠", 22);

        array.add(s1);
        array.add(s2);
        array.add(s3);

        Collections.sort(array);

        for (Student s : array) {
            System.out.println(s);
        }

        System.out.println("-------");
        for (int i = 0; i < array.size(); i++) {
            System.out.println(array.get(i));
        }

        System.out.println("-------");
        Iterator<Student> it = array.iterator();
        while (it.hasNext()) {
            Student s = it.next();
            System.out.println(s);
        }

    }
}
