package 第3阶段._6_函数式接口._2_常用的函数式接口._4_参数转换接口Function.使用Function接口;

import java.util.function.Function;

//需求: 使用Function的抽象方法 R apply(T t) 和 默认方法Function<T, R> andThen(Function<T, R> fun)
/*

*/
public class FunctionDemo {
    public static void main(String[] args) {
        convert("100", s -> Integer.parseInt(s));
        convert("100", Integer::parseInt);
        System.out.println();

        convert(100, i -> String.valueOf(i + 100));


        convert("100", Integer::parseInt,  i -> String.valueOf(i + 100));

    }

    //定义一个方法, 将字符串转换为int类型, 并在控制台输出
    private static void convert(String s, Function<String, Integer> fun){
        System.out.println(fun.apply(s));
    }

    //定义一个方法, 把一个int类型的数据加上一个整数之后, 转换为字符串输出到控制台
    private static void convert(int i, Function<Integer, String> fun) {
        System.out.println(fun.apply(i) + "\n");
    }

    //定义一个方法, 把一个String转换为int类型, 把这个int类型加上一个整数之后, 转换为String类型, 将结果输出到控制台
    private static void convert(String s, Function<String, Integer> fun1, Function<Integer, String> fun2) {
        String str = fun1.andThen(fun2).apply(s);
        System.out.println(str);
    }
}
