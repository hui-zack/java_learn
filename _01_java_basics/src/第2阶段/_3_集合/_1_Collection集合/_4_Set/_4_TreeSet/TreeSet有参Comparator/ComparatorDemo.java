package 第2阶段._3_集合._1_Collection集合._4_Set._4_TreeSet.TreeSet有参Comparator;

import java.util.Comparator;
import java.util.TreeSet;

//需求: 存储学生对象并遍历, 创建TreeSet集合使用带参构造方法
//     要求: 按照年龄从小到大排序, 年龄相同时, 按照姓名的字母顺序排序
public class ComparatorDemo {
    public static void main(String[] args) {
        TreeSet<Student> ts = new TreeSet<Student>(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                int num = o1.getAge() - o2.getAge();
                int num2 = o1.getAge() - o2.getAge() == 0 ? o1.getName().compareTo(o2.getName()) : num;
                return num2;
            }
        });

        Student s1 = new Student("zhangHui", 22);
        Student s2 = new Student("capFeiYu", 22);
        Student s3 = new Student("wuNam", 21);

        ts.add(s1);
        ts.add(s2);
        ts.add(s3);

        for (Student s : ts) {
            System.out.println(s);
        }
    }
}
