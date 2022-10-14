package 第2阶段._5_File._1_File.File类.File获取功能;

/*

需求: 使用File类的获取方法
*/

import java.io.File;
import java.io.IOException;

public class FileDemo {
    public static void main(String[] args) throws IOException {
        File f1 = new File("D:\\user\\work\\space\\java.txt");

        System.out.println(f1.isDirectory());
        System.out.println(f1.isFile());
        System.out.println(f1.exists());
        System.out.println("-----------------");

        System.out.println(f1.getAbsolutePath());
        System.out.println(f1.getPath());
        System.out.println(f1.getName());
        System.out.println("-----------------");

        File f2 = new File("D:\\user\\work\\space");
        for (String str : f2.list()) {
            System.out.println(str);
        }
        System.out.println("-----------------");

        for (File file : f2.listFiles()) {
            if (file.isFile()) {
                System.out.println(file.getName());
            }
        }
    }
}
