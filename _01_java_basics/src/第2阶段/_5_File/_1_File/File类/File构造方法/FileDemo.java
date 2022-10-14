package 第2阶段._5_File._1_File.File类.File构造方法;

import java.io.File;

//需求: 使用File类的三种构造方法创建File实例
/*
        File(String pathname):
            使用路径文件名字符串来创建File实例
        File(String parent, String child):
            使用路径字符串和文件名字符串创建新的File实例
        File(File parent, String child)
            使用父抽象路径名和子路径名字符串创建新的File实例
*/
public class FileDemo {
    public static void main(String[] args) {
        File file1 = new File("D:\\user\\work\\java.txt");
        System.out.println(file1);

        File file2 = new File("D:\\user\\work", "java.txt");
        System.out.println(file2);

        File file_parent = new File("D:\\user\\work");
        File file3 = new File(file_parent, "java.txt");
        System.out.println(file3);
    }
}
