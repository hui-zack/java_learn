package 第3阶段._6_函数式接口._2_常用的函数式接口._4_参数转换接口Function.Function接口字符串切片转型加值输出;

import java.util.function.Function;

//需求: 练习Function接口的apply方法和andThen方法
/*
要求:
    将字符串截取得到年龄部分
    将上一步的年龄字符串转换为int类型的数据
    将上一步的int数据加70, 得到一个int结果, 并在控制台输出
*/
public class FunctionDemo {
    public static void main(String[] args) {
        String[] strArray = {"林青霞, 33", "风清扬, 30", "桔梗, 18"};
        convert(strArray, s -> Integer.parseInt(s.split(", ")[1]), i -> String.valueOf(i + 70));

    }
    private static void convert(String[] strArray, Function<String, Integer> fun1, Function<Integer, String> fun2) {
        for (String  s : strArray) {
            String str = fun1.andThen(fun2).apply(s);
            System.out.println(str);
        }
    }
}
