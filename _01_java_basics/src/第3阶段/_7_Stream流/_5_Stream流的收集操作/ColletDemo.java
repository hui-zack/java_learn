package 第3阶段._7_Stream流._5_Stream流的收集操作;
//需求:
/**/
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ColletDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("林青霞");
        list.add("张曼玉");
        list.add("王祖贤");
        list.add("柳岩");
        //要求1 得到名字为3个字的流
        Stream<String> listStream = list.stream().filter(s -> s.length() == 3);
        //把Stream流操作完毕的数据收集为list, 并遍历
        List<String> list1 = listStream.collect(Collectors.toList());                   //Stream流收集List
        for (String s: list1) {
            System.out.println(s);
        }
        System.out.println();


        //创建Set集合对象
        Set<Integer> set = new HashSet<>();
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(33);
        set.add(35);
        //得到年龄大于25的Stream流
        Stream<Integer> setStream = set.stream().filter(i -> i > 25);
        //将set的stream流收集为set集合, 并遍历
        Set<Integer> set1 = setStream.collect(Collectors.toSet());                    //Stream流收集为set
        for (int i : set1) {
            System.out.println(i);
        }
        System.out.println();


        //定义一个字符串数组,每一个字符串数组由姓名数据和年龄数据组合而成
        String[] strArray ={"林青霞, 30", "张曼玉, 35", "王祖贤, 33", "柳岩, 25"};
        //得到strArray中年龄数据大于28的流
        Stream<String> arrayStream = Stream.of(strArray).filter(s -> Integer.parseInt(s.split(", ")[1]) > 28);
        //把姓名数据和年龄数据分别添加到map集合 并遍历
        Map<String, String> map = arrayStream.collect(Collectors.toMap((s -> s.split(", ")[0]), (s -> s.split(", ")[1])));  //Stream流收集为Map


        Set<String> keySet = map.keySet();
        for (String key : keySet) {
            String values = map.get(key);
            System.out.println(key + ", " + values);
        }

    }
}