package 第3阶段._7_Stream流._6_练习Stream流.男明星女明星;

import java.util.ArrayList;
import java.util.stream.Stream;

/*
现在有两个ArrayList集合, 分别存储6名男演员和6名女演员名字, 要求:
    男演员只要名字为3个字的前三人
    女演员只要姓林的, 并且不要第一个
    把过滤后的男演员和女演员合并到一起
    把上一步操作后的元素作为构造方法的参数创建对象, 遍历数据:
        演员类Actor已经提供, 里面有一个成员遍历, 一个带参构造方法, 已经成员变量对应的get/set方法
*/
public class StreamPractice筛选 {
    public static void main(String[] args) {
        ArrayList<String> manList = new ArrayList<>();
        manList.add("周润发");
        manList.add("成龙");
        manList.add("刘德华");
        manList.add("吴京");
        manList.add("周星驰");
        manList.add("李连杰");

        ArrayList<String> womanList = new ArrayList<>();
        womanList.add("林心如");
        womanList.add("张曼玉");
        womanList.add("林青霞");
        womanList.add("柳岩");
        womanList.add("林志玲");
        womanList.add("范冰冰");
        //男演员只要名字为3个字的前三人
        Stream<String> manStream = manList.stream().filter(s -> s.length() == 3).limit(3);
        //女演员只要姓林的, 并且不要第一个
        Stream<String> womanStream = womanList.stream().filter(s -> s.startsWith("林")).skip(1);
        //把过滤后的男演员和女演员合并到一起
        Stream<String> concatStream = Stream.concat(manStream, womanStream);

        //把上一步操作后的元素元素作为构造方法的参数创建演员对象, 遍历数据
        concatStream.map(Actor::new).forEach(System.out::println);

    }
}
