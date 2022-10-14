package 第2阶段._6_IO流._3_文件和集合._2_文件到集合;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

//需求: 把文本文件中的数据读取到集合中, 并遍历集合
//  要求文件中每一行数据是集合的一个的元素
/*
思路:
    (1) 创建字符缓冲输入流对象
    (2) 创建ArrayList集合对象
    (3) 调用字符缓冲输入流对象的方法读数据
    (4) 把读取的字符串数据存储到集合中
    (5) 释放资源
    (6) 遍历集合
*/
public class FileToArrayDemo {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("data\\javaSE.txt"));
        ArrayList<String> array = new ArrayList<>();

        //文件中的数据读取到集合
        String line;
        while ((line = br.readLine()) != null) {
            array.add(line);
        }

        br.close();

        //集合遍历到控制台
        for (String s : array) {
            System.out.println(s);
        }


        /*
        //遍历集合到控制台
        Iterator<String> it = array.iterator();
        while (it.hasNext()) {
            String s = it.next();
            System.out.print(s);
        }
        */

    }
}

