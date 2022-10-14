package 第3阶段._6_函数式接口._2_常用的函数式接口._2_数据消费接口Consumer.使用Comsumer接口;

import java.util.function.Consumer;

//需求: 使用Consumer接口的抽象方法void accept(T t); 默认方法default Consumer<T> andThen(Consumer after)
/*
Consumer<T>, 包含两个方法
    void accept(T t), 对给定的参数信心操作
    default Consumer<T> andThen(Consumer after), 执行完accept后, 通过返回一个组合的Consumer, 执行after继续重写accept实现依次进行不同的操作
Consumer接口也被称为消费性接口, 它消费的数据的数据类型由泛型指定
*/
public class ConsumerDemo {
    public static void main(String[] args) {
        //匿名内部类实现消费性接口Consumer, 重写accept(T t)方法为输出原字符串
        operatorString("张辉", new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });
        //匿名内部类实现消费性接口Consumer, 重写accept(T t)方法为输出反转后的字符串
        operatorString("张辉", new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(new StringBuilder(s).reverse().toString() + "\n");
            }
        });

        //Lambda实现消费性接口Consumer, 重写accept(T t)方法为输出原字符串
        operatorString( "天下第一", s -> System.out.println(s));
        //Lambda实现消费性接口Consumer, 重写accept(T t)方法为输出反转后的字符串
        operatorString("天下第一", s -> System.out.println(new StringBuilder(s).reverse().toString() + "\n"));


        //参数输入两个Consumer, 对同一个字符串, 进行不同的操作
        operatorString("国士无双", s -> System.out.println(s), s -> System.out.println(new StringBuilder(s).reverse().toString()));


    }
    private static void operatorString(String name, Consumer<String> con1, Consumer<String> con2) {
//        con1.accept(name);
//        con2.accept(name);
        con1.andThen(con2).accept(name);        //两个Consumer对象, 依次调用各自的accept(T t)方法
    }


    private static void operatorString(String name, Consumer<String> con) {
        con.accept(name);
    }
}
