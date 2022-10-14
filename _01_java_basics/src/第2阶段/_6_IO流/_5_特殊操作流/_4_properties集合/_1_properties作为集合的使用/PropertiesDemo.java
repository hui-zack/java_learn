package 第2阶段._6_IO流._5_特殊操作流._4_properties集合._1_properties作为集合的使用;

import java.util.Properties;
import java.util.Set;

//需求: 将Properties作为Map集合使用, 创建Properties对象并遍历
/*
    Properties的元素类只能是Object对象, 无法指定泛
*/
public class PropertiesDemo {
    public static void main(String[] args) {
        Properties prop = new Properties();     //Properties的元素类只能是Object对象, 无法指定泛型对象
        prop.put("张辉", 24);
        prop.put("曹飞雨", 23);
        prop.put("吴楠", 23);

        Set<Object> keySet = prop.keySet();
        for (Object key : keySet) {
            Object value = prop.get(key);
            System.out.println(key.toString() + " " + value.toString());
        }
    }
}
