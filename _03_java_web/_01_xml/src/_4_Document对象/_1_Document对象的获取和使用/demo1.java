
package _4_Document对象._1_Document对象的获取和使用;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.File;
import java.io.IOException;

/*
* Jsoup快速入门
* */
public class demo1 {
    public static void main(String[] args) throws IOException {
        String xml_path = demo1.class.getClassLoader().getResource("student.xml").getPath();        //* 获取xml文件路径
        System.out.println(xml_path);


        Document docELe = Jsoup.parse(new File(xml_path), "utf-8");                             //* 根据xml文档来获取Document对象(加载文档进内存, 获取DOM树); parse的IO异常在这里抛出;

        Elements name_label_array = docELe.getElementsByTag("name");                               //* 返回一个ArrayList<标签对象>, ctrl + 鼠标焦点查看
        // System.out.println(name_label_array);

        Element name0 = name_label_array.get(0);                                                            //* 获取第一个name对象
        System.out.println((name0.text()).replace(" ", ""));                              //* 获取文本对象
    }
}
