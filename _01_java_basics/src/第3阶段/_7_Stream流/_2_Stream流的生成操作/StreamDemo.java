package 第3阶段._7_Stream流._2_Stream流的生成操作;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.stream.Stream;

//需求: 生成Collection集合的Stream流, Map集合的Stream流, 数组的Stream流
public class StreamDemo {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();             //Collection集合生成Stream流
        Stream<String> listStream = list.stream();

        HashSet<String> set = new HashSet<>();
        Stream<String> setStream = set.stream();


        Map<String, Integer> map = new HashMap<>();
        Stream<String> keyStream = map.keySet().stream();                       //Map生成key的Stream流
        Stream<Integer> values = map.values().stream();                         //map生成value的Stream流

        String[] strArray = {"hello", "java", "world"};

        Stream<String> strArrayStream = Stream.of(strArray);                    //数组的Stream流, 方式1
        Stream<String> strArrayStream1 = Stream.of("hello", "java", "world");   //数组的Stream流, 方式1

    }
}
