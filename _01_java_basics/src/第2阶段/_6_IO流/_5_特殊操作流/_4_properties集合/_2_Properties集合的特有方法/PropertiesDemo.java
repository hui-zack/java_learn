package 第2阶段._6_IO流._5_特殊操作流._4_properties集合._2_Properties集合的特有方法;
//需求: 创建properties集合对象, 使用其特有的三个方法
/*
properties特有的三个方法:
    Object setProperty(String key, String value):
        注意参数是字符串对象, 返回一个Object对象
        设置集合的key和value, 参数都是String类型
        底层调用的是Hashtable的put方法
    Set<String> StringPropertyNames():
        获得一个KeySet集合, 相当雨Map中的KeySet()方法
    String getProperty(String key):
        根据key获取value值, 相当于Map中的get(T key)


*/

import java.util.Properties;
import java.util.Set;

public class PropertiesDemo {
    public static void main(String[] args) {
        Properties prop = new Properties();
        prop.setProperty("张辉", "24");                           //setProperty(String key, String value)方法
        prop.setProperty("曹飞雨", "23");
        prop.setProperty("吴楠", "24");

        Set<String> keySet = prop.stringPropertyNames();        //StringPropertyNames()方法
        for (String key : keySet) {
            String value = prop.getProperty(key);               //getProperty(String key)方法
            System.out.println(key + "," + value);
        }
    }
}
