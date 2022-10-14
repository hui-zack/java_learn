package 第1阶段._3_数组集合和String._3_Arraylist;

import java.util.ArrayList;

// 需求: 创建一个存储字符串的集合, 存储3个字符串元素, 编写代码进行遍历
/*
* 思路:
*   1. 创建集合对象
*   2. 在集合中添加字符串对象
*   3. 使用get方法获取元素
*   4. 使用size()方法获取长度
*   5. 生成遍历集合的通用格式
* */
public class 集合遍历 {
    public static void main(String[] args) {
        //创建集合对象
        ArrayList<String> array = new ArrayList<String>();
        array.add("hello");
        array.add("world");
        array.add("java");

        //通用遍历格式
        for (int i=0; i<array.size(); i++) {
            String s = array.get(i);
            System.out.println(s);
        }
    }
}
