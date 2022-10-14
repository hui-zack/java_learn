package 第2阶段._5_File._2_Folder.复制单极文件夹;

import java.io.*;

//需求: 把"data"文件夹及文件复制到桌面, 不包含内部文件夹
/*
思路:
    (1) 创建数据源目录File对象, 路径是data
    (2) 获取数据源目录File对象的名字(data)
    (3) 创建目的地目录File对象, 路径名是模块名 + data组成
    (4) 创建目的地目录对应的File是否存在, 如果不存在, 就创建
    (5) 获取数据源目录下的所有文件的File数组
    (6) 遍历File数组, 得到每一个File对象, 该File对象, 其实就是数据源文件
            获取数据源文件File对象的名称(mn.jpg)
            创建目的地文件File对象, 路径名是目的地目录 + mn.jpg组成
            复制文件
                由于文件不仅仅是文本文件, 还有图片, 视频等文件, 所以采用文件复制文件

*/
public class FolderCopyOneDemo {

    public static void main(String[] args) throws IOException {
        copyOneDirectory("data\\aa\\data_img", "C:\\Users\\admin\\Desktop");
    }

    public static void copyOneDirectory(String directory_src, String directory_dst) throws IOException {
        //创建目标文件夹
        File srcFolder = new File(directory_src);
        String srcFolderName = srcFolder.getName();
        File dstFolderName = new File(directory_dst, srcFolderName);
        if(!dstFolderName.exists()) {
            dstFolderName.mkdir();
        }

        //获取源文件列表
        File[] listFiles = srcFolder.listFiles();

        //获取srcFile, 创建dstFile, 数据从srcFile复制到dstFile
        for (File srcFile : listFiles) {
            System.out.println("copy file :" + srcFile);;

            String fileName = srcFile.getName();
            File dstFile = new File(dstFolderName, fileName);

            copy(srcFile, dstFile);
        }


    }

    //文件复制函数
    public static void copy(File srcFile, File dstFile) throws IOException{
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(srcFile));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(dstFile));

        byte[] chs = new byte[1024];
        int len;
        while ((len = bis.read(chs)) != -1) {
            bos.write(chs, 0, len);
        }

        bis.close();
        bos.close();
    }
}
