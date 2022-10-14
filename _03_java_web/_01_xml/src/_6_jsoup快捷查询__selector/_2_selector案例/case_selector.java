// code describe: selector使用的案例
package _6_jsoup快捷查询__selector._2_selector案例;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.File;
import java.io.IOException;


public class case_selector {
    public static void main(String[] args) throws IOException {
        //* 获取number属性值为heima_0001 student标签下的age标签
        String path = case_selector.class.getClassLoader().getResource("student.xml").getPath();
        Document document = Jsoup.parse(new File(path), "utf8");

        Elements stu_ele = document.select("student[number='heima_0001']> age");
        System.out.println(stu_ele);

    }

    public static void print(String str){
        System.out.println(str);
    }
}
