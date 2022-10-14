package 第2阶段._3_集合._3_Map集合._4_Map的遍历._2_entrySet遍历;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

//需求: 创建Map集合, 使用entry方法遍历集合
public class MapDemo {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();

        map.put("犬夜叉", "戈薇");
        map.put("珊瑚", "弥勒");
        map.put("张无忌", "小昭");

        Set<Map.Entry<String, String>> entrySet = map.entrySet();

        for (Map.Entry<String, String> me : entrySet) {
            String key = me.getKey();
            String value = me.getValue();
            System.out.println(key + ":" + value);
        }
    }
}
