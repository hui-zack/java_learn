package 第3阶段._7_Stream流._3_Stream流的中间操作._3_中间操作_合并concat_去重distinct;
//需求: 使用Stream流的 合并concat方法 和 去重distinct方法
/*
要求:
    1. 取前4个数据流组成一个流
    2. 跳过2个数据组成一个流
    3. 合并1的流和2的流, 把新的流在控制台输出
    4. 合并1的流和2的流, 去掉新流中重复的元素, 要求字符串不能重复
*/
import java.util.ArrayList;
import java.util.stream.Stream;

public class ConcatAndDistinctDemo {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("张曼玉");
        list.add("林青霞");
        list.add("王祖贤");
        list.add("柳岩");
        list.add("张敏");
        list.add("张无忌");

        Stream<String> stream1 = list.stream().limit(4);
        Stream<String> stream2 = list.stream().skip(2);

        Stream.concat(stream1, stream2).forEach(System.out::println);                   //合并流, 把新的流在控制台输出

        Stream.concat(stream1, stream2).distinct().forEach(System.out::println);        //合并流, 去掉新流中重复的元素, 要求字符串不能重复
    }
}
