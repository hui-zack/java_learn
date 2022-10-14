package 第2阶段._5_File._2_Folder.复制多级文件夹;
import java.io.*;
//需求: 把data复制到桌面, 包含内部文件夹
/*
思路:
    (1) 创建数据源File对象srcFile, 路径"data"
    (2) 创建目的地File对象dstFile, 路径"C:\Users\admin\Desktop"
    (3) 编写复制文件的方法, 参数为srcFile和dstFile
    (4) 编写复制文件夹的方法, 参数为srcFile和dstFile
            方法内部判断数据源File是否是目录
                是:
                    在目的地下创建和数据源File名称一样的目录
                    获取数据源头File下所有文件或目录的File数据
                    遍历该File数组, 获取每一个File对象
                    把该File作为数据源File对象, 递归调用复制文件夹的方法
                不是:
                    字节流字节复制

*/

public class FolderCopyMoreDemo {

    public static void main(String[] args) throws IOException {
        File srcFile = new File("data");
        File dstFile = new File("C:\\Users\\admin\\Desktop");
        copyFolder(srcFile, dstFile);
    }


    //文件夹复制方法
    private static void copyFolder(File srcFile, File dstFile) throws IOException {
        if (srcFile.isDirectory()) {
            //根据srcFile目录创建文件夹, 创建到dstFile目录下
            String srcFileName = srcFile.getName();
            // System.out.println("src dir:" + srcFile.getAbsolutePath());
            File newFolder = new File(dstFile, srcFileName);
            // System.out.println("new dir:" + newFolder.getAbsolutePath());
            if(!newFolder.exists()) {
                newFolder.mkdir();
            }

            //获取srcFile下的所有文件和目录
            File[] fileArray = srcFile.listFiles();
            if (fileArray != null) {
                //递归调用复制所有文件夹
                for (File file : fileArray) {
                    copyFolder(file, newFolder);        //递归回调
                }
            }
        } else {
            File newFile = new File(dstFile, srcFile.getName());
            copyFile(srcFile, newFile);
        }
    }


    //文件复制方法
    private static void copyFile(File srcFile,File dstFile) throws IOException {
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(dstFile));
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(srcFile));
        byte[] bys = new byte[1024];
        int len;
        while ((len = bis.read(bys)) != -1) {
            bos.write(bys, 0, len);
        }

        bos.close();
        bis.close();
    }
}
