package 第2阶段._3_集合._3_Map集合._5_集合嵌套案例._1_ArrayList存储HashMap;
//需求: 创建一个ArrayList集合, 存储三个元素, 每个元素都是HashMap, 每一个元素的键和值都是String
/*
思路:
    (1) 创建一个ArrayList集合对象
    (2) 创建一个HashMap集合, 并添加键值对对象
    (3) 把HashMap作为元素添加到ArrayList集合
    (4) 遍历ArrayList集合

    第一个HashMap集合的元素:
        孙策      大乔
        周瑜      小乔
    第二个hashMap集合的元素:
        郭靖      黄蓉
        杨过      小龙女
    第三个hashMap集合的元素:
        令狐冲     任盈盈
        林平子     岳灵珊
*/

import java.util.*;


public class ArrayList存储HashMap {
    public static void main(String[] args) {
        ArrayList<HashMap<String, String>> array = new ArrayList<>();

        HashMap<String, String> hm1 = new HashMap<>();
        hm1.put("宋策", "大桥");
        hm1.put("周瑜", "小乔");



        HashMap<String, String> hm2 = new HashMap<>();
        hm1.put("郭靖", "黄蓉");
        hm1.put("杨过", "小龙女");




        HashMap<String, String> hm3 = new HashMap<>();
        hm1.put("令狐冲", "任盈盈");
        hm1.put("林平之", "岳灵珊");

        array.add(hm1);
        array.add(hm2);
        System.out.println(hm2.hashCode());
        System.out.println(array );
        array.add(hm3);
        System.out.println(hm3.hashCode());
        System.out.println(array);

        System.out.println("-------------------------------");

        //keySet遍历
        for (HashMap<String, String> hm : array) {
            Set<String> keySet = hm.keySet();
            for (String key : keySet) {
                String value = hm.get(key);
                System.out.println(key + " : " + value);
            }
        }

        System.out.println("-------------------------------");

        //entrySet遍历
        for (HashMap<String, String> hm : array) {
            Set<Map.Entry<String, String>> entrySet = hm.entrySet();
            for (Map.Entry<String, String> me : entrySet) {
                String key = me.getKey();
                String value = me.getValue();
                System.out.println(key + ":" + value);
            }

        }

    }
}
