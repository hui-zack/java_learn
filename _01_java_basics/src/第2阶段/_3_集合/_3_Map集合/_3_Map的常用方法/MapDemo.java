package 第2阶段._3_集合._3_Map集合._3_Map的常用方法;

import java.util.HashMap;
import java.util.Map;

//需求: 创建Map集合并使用其常用方法
/*
常用方法:
    V put(K key, V value)
        添加键值对
    V remove(Object key)
        根据键依次键值对元素
    Void clear()
        移除所有键值对元素
    Boolean containsKey(Object key)
        判断集合是否包含指定键
    Boolean containsValue(object value)
        判断集合是否包含指定值
    boolean isEmpty()
        判断集合是否为空
    int size()
        返回集合长度
*/
public class MapDemo {
    public static void main(String[] args) {
        Map<String, String> m = new HashMap<String, String>();

        m.put("杨过", "小龙女");
        m.put("张无忌", "小昭");
        m.put("犬夜叉", "戈薇");

        System.out.println(m);
        System.out.println(m.remove("张无忌"));
        System.out.println(m.containsKey("张无忌"));
        System.out.println(m.containsValue("戈薇"));
        System.out.println(m.isEmpty());
        System.out.println(m.size());
        m.clear();
        System.out.println(m.size());
    }
}
