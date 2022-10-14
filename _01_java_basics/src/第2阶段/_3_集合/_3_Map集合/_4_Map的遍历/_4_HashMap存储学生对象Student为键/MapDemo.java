package 第2阶段._3_集合._3_Map集合._4_Map的遍历._4_HashMap存储学生对象Student为键;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

//需求: 创建一个HashMap集合, 键是学生对象, 值是居住地, 创建多个兼职对元素, 并遍历
/*
思路:
    (1) 定义学生类, 重写hashCode()和equals()方法
    (2) 创建HashMap集合对象
    (3) 创建学生对象
    (4) 把学生添加到集合
    (5) 遍历集合:
        keySet遍历
        entrySet遍历
*/
public class MapDemo {
    public static void main(String[] args) {
        Map<Student, String> map = new HashMap<>();

        Student s1 = new Student("犬夜叉", 22);
        Student s2 = new Student("桔梗", 16);
        Student s3 = new Student("戈薇", 16);

        map.put(s1, "森林");
        map.put(s2, "村庄");
        map.put(s3, "城市");

        //keySet遍历
        Set<Student> keySet = map.keySet();
        for (Student key : keySet) {
            String value = map.get(key);
            System.out.println(key + ":" + value);
        }

        //entrySet遍历
        Set<Map.Entry<Student, String>> entrySet = map.entrySet();
        for (Map.Entry<Student, String> me : entrySet) {
            Student key = me.getKey();
            String value = me.getValue();
            System.out.println(key + ":" + value);
        }
    }
}
