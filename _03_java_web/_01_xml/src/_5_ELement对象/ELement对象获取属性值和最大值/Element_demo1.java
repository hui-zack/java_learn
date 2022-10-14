package _5_ELement对象.ELement对象获取属性值和最大值;

import _4_Document对象._1_Document对象的获取和使用.demo1;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import java.io.File;
import java.io.IOException;

public class Element_demo1 {
    public static void main(String[] args) throws IOException {
        String xml_path = demo1.class.getClassLoader().getResource("student.xml").getPath();
        Document stu_xml = Jsoup.parse(new File(xml_path), "utf8");

        Element ele_first_stu = stu_xml.getElementsByTag("student").get(0);                                          //* 获取第一个student标签
        Element ele_first_name = ele_first_stu.getElementsByTag("name").get(0);                                      //* 获取到第一个name标签


        String number = ele_first_stu.attr("number");                                                               //* 获取标签上的属性值
        print("获取student标签的属性值: " + number);
        print("获取name标签的属性值(text()方法): " + ele_first_name.text());                                                      //* 获取文本内容-text()
        print("获取name标签的属性值(html()方法): " + ele_first_name.html().replace("\n", ""));                  //* 获取文本内容-html()

    }

    public static void print(String str){
        System.out.println(str);
    }
}
