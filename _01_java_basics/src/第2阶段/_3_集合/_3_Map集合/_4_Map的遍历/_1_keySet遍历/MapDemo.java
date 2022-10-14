package 第2阶段._3_集合._3_Map集合._4_Map的遍历._1_keySet遍历;
// 需求: 创建一个Map集合并遍历

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();

        map.put("犬夜叉", "戈薇");
        map.put("张无忌", "小昭");
        map.put("杨过", "小龙女");

        Set<String> keySet = map.keySet();
        for (String key : keySet) {
            String value = map.get(key);
            System.out.println(key + ":" + value);
        }

    }
}
