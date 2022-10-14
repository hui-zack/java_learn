package _4_Document对象._2_Document对象的getXXX方法获取标签;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.File;
import java.io.IOException;

/*
* code describe: document对象通过get方法获取标签对象
*
* */
public class getXXX_Demo {
    public static void main(String[] args) throws IOException {
        String xml_path = getXXX_Demo.class.getClassLoader().getResource("student.xml").getPath();
        Document doc = Jsoup.parse(new File(xml_path), "utf8");
        Elements stu_array = doc.getElementsByTag("student");                                   //* getElementsByTag(String tagName)方法, 获取参数为student元素的ArrayList
        //System.out.println(stu_array);


        Element itcast = doc.getElementById("itcast");                                                   //* getElementById(String id)方法, 根据id获取标签
        //System.out.println(itcast.text());

        Elements eles = doc.getElementsByAttributeValue("number", "heima_0001");                         //* 根据键值和属性值获取标签, doc.getElementsByAttributeValue(String key, String value);
        //System.out.println(eles);

        Elements id_ele = doc.getElementsByAttribute("id");                                         //* 根据键名获取id, doc.getElementsByAttribute(String key);
        System.out.println(id_ele);

    }
}
