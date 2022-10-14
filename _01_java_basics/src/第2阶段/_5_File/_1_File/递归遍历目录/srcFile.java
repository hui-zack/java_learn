package 第2阶段._5_File._1_File.递归遍历目录;

import java.io.File;

//需求: 给定一个路径, 通过递归完成遍历该目录文件下的所有内容
/*
思路:
    (1)根据给定的路径创建一个File对象
    (2)定义一个方法, 用于获取给定目录下的所有内容, 参数为第一步创建的File
        获取给定的File目录下所有的文件或目录数组
        遍历File数组, 得到每一个File对象
        判断File是否是目录:
            是->递归调用
            不是, 获取绝对路径输出到控制台
    (3) 调用方法

*/
public class srcFile {
    public static void main(String[] args) {
        File srcFile = new File("D:\\user\\learn");
        getAllFile(srcFile);
    }

    //目录遍历方法
    public static void getAllFile(File srcFile) {
        File[] listFiles = srcFile.listFiles();
        if (listFiles != null) {
            for (File file : listFiles) {
                if (file.isDirectory()) {
                    getAllFile(file);
                } else {
                    System.out.println(file.getAbsolutePath());
                }
            }
        }
    }
}
