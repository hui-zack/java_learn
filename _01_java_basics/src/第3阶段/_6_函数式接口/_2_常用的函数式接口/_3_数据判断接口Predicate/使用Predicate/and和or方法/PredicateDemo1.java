package 第3阶段._6_函数式接口._2_常用的函数式接口._3_数据判断接口Predicate.使用Predicate.and和or方法;
//需求: 实现Predicate接口, 重写test方法, 调用and和or方法, 实现对字符转长度的boolean判断和 && || 运算
import java.util.function.Predicate;

public class PredicateDemo1 {
    public static void main(String[] args) {
        //两个Lambda都重写test判断条件并返回各自boolean结果
        boolean result = checkString("java world", s -> s.length() > 8, s -> s.length() < 8);
        System.out.println(result);
    }
    private static boolean checkString(String s, Predicate<String> pre1, Predicate<String> pre2){
//        boolean b1 = pre1.test(s);
//        boolean b2 = pre2.test(s);
//        return b1 && b2;

        //return pre1.and(pre2).test(s);        //and方法
        return pre1.and(pre2).test(s);          //or方法
    }
}
