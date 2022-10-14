package 第2阶段._5_File._1_File.File类.File类删除功能;
//需求: 使用File类的删除功能

import java.io.File;
import java.io.IOException;

public class FileDemo {
    public static void main(String[] args) throws IOException {
        File f1 = new File("tmp");
        System.out.println(f1.mkdir());
        File f2 = new File("tmp\\java.txt");
        System.out.println(f2.createNewFile());

        System.out.println("--------");

        System.out.println(f1.delete());
        System.out.println(f2.delete());
        System.out.println(f1.delete());

    }
}
