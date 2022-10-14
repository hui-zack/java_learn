package 第2阶段._6_IO流._3_文件和集合._3_case_点名器;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
//需求: 有一个文件, 里面存储了班级同学的姓名, 每一个姓名占一行, 要求通过程序实现随机点名器
/*
思路:
    (1) 创建字符缓冲流对象
    (2) 创建ArrayList集合对象, 添加班级同学的姓名
    (3) 调用字符缓冲输入流对象的方法读数据
    (4) 把读取到的字符串存储到集合中
    (5) 释放资源
    (6) 使用Random产生一个随机数, 随机数的范围在: [0, 集合的长度]
    (7) 将随机数作为索引传到ArrayList集合中
    (8) 将第七步得到的数据输出到控制台
*/
public class 点名器Demo {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("data\\StudentName.txt"));
        ArrayList<String> array = new ArrayList<>();

        String line;
        while ((line = br.readLine()) != null) {
            array.add(line);
        }
        br.close();

        //获取随机数
        Random random = new Random();
        int index = random.nextInt(array.size());

        String s = array.get(index);
        System.out.println(s);



    }
}
