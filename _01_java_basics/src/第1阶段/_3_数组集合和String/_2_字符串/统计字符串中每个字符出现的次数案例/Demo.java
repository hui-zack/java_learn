package 第1阶段._3_数组集合和String._2_字符串.统计字符串中每个字符出现的次数案例;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

//需求: 键盘录入一个字符串, 要求统计字符串中每个字符出现的次数
//      例如: 键盘录入"aababcabcdabcde" 在控制台输出: "a(5)b(4)c(3)d(2)e(1)"
/*
思路:
    (1) 键盘录入一个字符串
    (2) 创建HashMap集合, 键类型:Character,  值类型:Integer
    (3) 遍历字符串, 得到每一个字符
    (4) 拿得到的每一个字符作为键到HashMap集合中找对应的值, 看其返回值:
            如果返回值是null: 说明该字符在HashMap集合中不存在, 就把该字符串作为键, 1作为值存储
            如果返回值不是null: 说明字符在HashMap集合中存在, 把值加1. 然后重新存储该字符和对应的值
    (5) 遍历HashMap, 获取键和值, 按要求进行拼接
    (6) 输出结果
*/
public class Demo {
    public static void main(String[] args) {
        //键盘录入字符串
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入字符串:");
        String s = sc.nextLine();

        HashMap<Character, Integer> hm = new HashMap<>();

        //给集合添加元素, 首次出现的字符hm.put(key, 1), 不是首次出现的字符hm.put(key, value++)
        for (int i = 0; i < s.length(); i++) {
            char key = s.charAt(i);
            Integer value = hm.get(key);
            if (value == null) {
                hm.put(key, 1);
            } else {
                value ++;
                hm.put(key,value);
            }
        }

        StringBuilder sb = new StringBuilder();
        //遍历集合, 获取key和value, 按要求添加为可变字符串
        Set<Character> keySet = hm.keySet();
        for(Character key : keySet) {
            Integer value = hm.get(key);
            sb.append(key).append('(').append(value).append(')');
        }
        //可变字符串转换为字符串
        String str = sb.toString();

        //输出结果
        System.out.println(str);

    }
}
