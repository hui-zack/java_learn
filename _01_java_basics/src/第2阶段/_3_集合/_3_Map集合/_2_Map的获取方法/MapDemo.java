package 第2阶段._3_集合._3_Map集合._2_Map的获取方法;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

//需求:创建一个Map集合, 并使用Map集合的三种获取方法
/*
方法概述:
    V get(Object Key)
        根据键获取值
    Set<K> keySet()
        获取键的Set集合
    Collection<V> values()
        获取值的Link集合
    Set<Map.Entry<K, V>> entrySet()
        获取所有键值对对象的集合
*/
public class MapDemo {
    public static void main(String[] args) {
        Map<String, String> m = new HashMap<>();

        m.put("犬夜叉", "戈薇");
        m.put("杨过", "小龙女");
        m.put("张无忌", "小昭");

        //键获取值
        System.out.println(m.get("犬夜叉"));

        //获取键集合
        Set<String> keySet = m.keySet();
        System.out.println(keySet);

        //获取值集合
        Collection<String> value = m.values();
        System.out.println(value);
    }
}
