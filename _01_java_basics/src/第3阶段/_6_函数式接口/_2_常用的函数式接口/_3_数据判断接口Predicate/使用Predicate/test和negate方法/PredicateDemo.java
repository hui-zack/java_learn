package 第3阶段._6_函数式接口._2_常用的函数式接口._3_数据判断接口Predicate.使用Predicate.test和negate方法;
//实现Predicate接口, 重写test方法, 调用negate方法, 实现对字符转长度的boolean判断和
import java.util.function.Predicate;

public class PredicateDemo {
    public static void main(String[] args) {
        //重写test判断条件并返回boolean结果
        boolean bl1 = checkStringLength("world", s -> s.length() > 8);
        System.out.println(bl1);

        boolean bl2 = checkStringLength("java world", s -> s.length() > 8);
        System.out.println(bl2);

    }
    private static boolean checkStringLength(String s,Predicate<String> pre){

        //return pre.test(s);
        return pre.negate().test(s);            //Predicate negate()方法; 将pre对象的接口反转并返回这个对象
    }
}
