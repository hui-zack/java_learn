package 第2阶段._5_File._1_File.File类.File创建功能;

import java.io.File;
import java.io.IOException;

/*

*/
public class FileDemo {
    public static void main(String[] args) throws IOException {
        //需求1: 创建文件(文件夹必须存在)
        File f1 = new File("D:\\user\\work\\space\\java.txt");
        System.out.println(f1.createNewFile());

        //需求2: 创建单机目录
        File f2 = new File("D:\\user\\work\\space\\javaSE");
        System.out.println(f2.mkdir());

        //需求3: 创建多级目录
        File f3 = new File("D:\\user\\work\\space\\javaWEB\\html");
        System.out.println(f3.mkdirs());
    }
}
