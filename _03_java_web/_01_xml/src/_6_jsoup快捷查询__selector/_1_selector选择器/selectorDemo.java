package _6_jsoup快捷查询__selector._1_selector选择器;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import java.io.File;
import java.io.IOException;

// code describe: selector选择器的使用(通过css查找标签的方式来找)
public class selectorDemo {
    public static void main(String[] args) throws IOException {
        String path = selectorDemo.class.getClassLoader().getResource("student.xml").getPath();
        Document docu = Jsoup.parse(new File(path), "utf8");
        Elements nameList = docu.select("name");                //* 标签选择器
        print(nameList.get(0).toString());
        Elements eleList = docu.select("#itcast");              //* id选择器
        print(eleList.toString());
    }

    public static void print(String str){
        System.out.println(str);
    }

}
