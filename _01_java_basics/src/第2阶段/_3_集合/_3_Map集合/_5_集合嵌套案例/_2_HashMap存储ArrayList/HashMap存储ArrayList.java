package 第2阶段._3_集合._3_Map集合._5_集合嵌套案例._2_HashMap存储ArrayList;
//需求: 创建一个HashMap集合,存储三个键值对元素, 每一个键值对元素的键是String, 值是ArrayList
//      每一个ArrayList的元素是String, 并遍历
/*
思路:
    (1) 创建HashMap集合
    (2) 创建ArrayList集合,并添加元素
    (3) 把ArrayList作为元素添加到HashMap集合

    存储的数据如下:
        第一个ArrayList集合的元素:(三国演义)
            诸葛亮
            赵云
        第二个ArrayList的元素: (西游记)
            唐僧
            孙悟空
        第三个ArrayList的元素:(水浒传)
            武松
            鲁智深
 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMap存储ArrayList {
    public static void main(String[] args) {
        //创建HashMap集合
        HashMap<String, ArrayList<String>> hm = new HashMap<String, ArrayList<String>>();

        ArrayList<String> array1 = new ArrayList<>();
        array1.add("诸葛亮");
        array1.add("赵云");

        ArrayList<String> array2 = new ArrayList<>();
        array2.add("唐僧");
        array2.add("孙悟空");

        ArrayList<String> array3 = new ArrayList<>();
        array3.add("武松");
        array3.add("鲁智深");

        hm.put("三国演义", array1);
        hm.put("西游记", array2);
        hm.put("水浒传", array3);

        System.out.println(hm);

        //keySet遍历
        Set<String> keySet = hm.keySet();
        for (String key : keySet) {
            System.out.println(key);
            ArrayList<String> value = hm.get(key);
            for (String s : value) {
                System.out.println("\t" + s);
            }
        }

        System.out.println("---------------------");

        //entrySet遍历
        Set<Map.Entry<String, ArrayList<String>>> entrySet = hm.entrySet();
        for (Map.Entry<String, ArrayList<String>> me : entrySet) {
            String key = me.getKey();
            System.out.println(key);
            ArrayList<String> value = me.getValue();
            for (String s : value) {
                System.out.println("\t" + s);
            }
        }
    }

}
