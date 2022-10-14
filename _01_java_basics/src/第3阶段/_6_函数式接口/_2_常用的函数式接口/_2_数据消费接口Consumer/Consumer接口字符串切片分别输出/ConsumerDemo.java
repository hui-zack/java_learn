package 第3阶段._6_函数式接口._2_常用的函数式接口._2_数据消费接口Consumer.Consumer接口字符串切片分别输出;
//需求: 使用Consumer接口的抽象方法void accept(T t); 默认方法default Consumer<T> andThen(Consumer after)
import java.util.function.Consumer;

/*
String[] strArray = {"林青霞, 30", "张曼玉, 35", "王祖贤, 33"};
字符串数组中由多条信息, 请按照格式:
    姓名: XX, 年龄: XX
    ...
打印出来
    要求:
        把打印姓名的动作作为第一个Consumer接口的Lambda实例
        把打印年龄的动作作为第二个Consumer接口的Lambda实例
        将两个Consumer接口按照一定的顺序组合到一起使用
*/
public class ConsumerDemo {
    public static void main(String[] args) {
        String[] strArray = {"林青霞, 30", "张曼玉, 35", "王祖贤, 33"};
        operatorString(strArray, s -> System.out.print("姓名: " + s.substring(0, 3)), s -> System.out.println(", 年龄: " + s.substring(5)));
    }
    private static void operatorString(String[] strArray, Consumer<String> con1, Consumer<String> con2) {
        for (String s : strArray ) {
            con1.andThen(con2).accept(s);
        }
    }
}