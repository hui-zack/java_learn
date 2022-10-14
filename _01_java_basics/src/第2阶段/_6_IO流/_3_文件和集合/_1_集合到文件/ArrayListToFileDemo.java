package 第2阶段._6_IO流._3_文件和集合._1_集合到文件;
//需求:把ArrayList集合中的字符串数据写入到文本文件, 要求一个字符串元素作为一行数据
/*
思路:
    (1)创建ArrayList集合
    (2)往集合中存储字符串元素
    (3)创建字符缓冲流队形
    (4)遍历集合, 得到每一个字符串数据
    (5)调用字符缓冲输出流对象的方法写数据
    (6)释放资源
*/

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListToFileDemo {
    public static void main(String[] args) throws IOException {
        ArrayList<String> array = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            array.add("hello java");
        }

        BufferedWriter bw = new BufferedWriter(new FileWriter("data\\javaSE.txt", true));

        for (String s : array) {
            bw.write(s);
            bw.newLine();
            bw.flush();
        }

        for (int i = 0; i < array.size(); i++) {
            bw.write(array.get(i));
            bw.newLine();
            bw.flush();
        }

        Iterator<String> it = array.iterator();
        while (it.hasNext()) {
            String s = it.next();
            bw.write(s);
            bw.newLine();
            bw.flush();
        }

        bw.close();
    }
}
