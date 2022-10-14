package _3_Jsoup对象的parse方法;

import _4_Document对象._1_Document对象的获取和使用.demo1;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.File;
import java.io.IOException;
import java.net.URL;

public class method_Jsoup__parse {
    public static void main(String[] args) throws IOException {
        //* 解析文件类型的xml
        String xml_path = demo1.class.getClassLoader().getResource("student.xml").getPath();        // 获取xml文件路径
        Document stu_xml = Jsoup.parse(new File(xml_path), "utf8");
        // System.out.println(stu_xml);

        //* 解析字符串类型的xml
        String str = stu_xml.toString();
        Document str_xml = Jsoup.parse(str);
        // System.out.println(stu_xml1);

        //* 解析网络xml
        URL url = new URL("https://baike.baidu.com/item/jsoup/9012509?fr=aladdin");
        Document net_xml = Jsoup.parse(url, 10000);//超时时间10秒
        System.out.println(net_xml);
    }
}
