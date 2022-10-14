package 第2阶段._3_集合._3_Map集合._4_Map的遍历._3_HashMap存储学生对象Student为值;
//需求: 创建一个HashMap集合, 存储学生的学号和学生对象, 并遍历

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
思路:
    (1) 定义学生类
    (2) 创建HashMap集合对象
    (3) 创建学生对象
    (4) 把学生的学号和学生对象添加到集合
    (5) 遍历集合:
        KeySet遍历
        entrySet遍历
*/
public class MapDemo {
    public static void main(String[] args) {
        Map<String, Student> map = new HashMap<>();

        Student s1 = new Student("犬夜叉", 22);
        Student s2 = new Student("桔梗", 16);
        Student s3 = new Student("戈薇", 16);

        map.put("001", s1);
        map.put("002", s2);
        map.put("003", s3);

        //keySet遍历
        Set<String> keySet = map.keySet();
        for (String key : keySet) {
            Student value = map.get(key);
            System.out.println(key + ":" + value);
        }

        //entrySet遍历
        Set<Map.Entry<String, Student>> entrySet = map.entrySet();
        for (Map.Entry<String, Student> me : entrySet) {
            String key = me.getKey();
            Student value = me.getValue();
            System.out.println(key + ":" + value);
        }
    }
}

