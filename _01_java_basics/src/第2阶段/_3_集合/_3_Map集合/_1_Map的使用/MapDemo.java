package 第2阶段._3_集合._3_Map集合._1_Map的使用;

import java.util.HashMap;
import java.util.Map;

//需求: 创建一个Map集合并使用put(K, V)方法添加对象
public class MapDemo {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();

        map.put("001", "张辉");
        map.put("002", "曹飞雨");
        map.put("003", "吴楠");

        System.out.println(map.put("004", "java"));

        System.out.println(map);
    }
}
