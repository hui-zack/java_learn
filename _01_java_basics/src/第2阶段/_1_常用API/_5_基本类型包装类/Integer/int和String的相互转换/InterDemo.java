package 第2阶段._1_常用API._5_基本类型包装类.Integer.int和String的相互转换;
// 需求1: 将int类型的数据转为String类型
// **需求2: 将String类型的数据转为int类型
public class InterDemo {
    public static void main(String[] args) {
    //int --> String
        //方式1 更方便
        int number = 111;
        String s = "" + number;
        System.out.println(s);

        //方式2 更专业, 想转啥转啥
        String s2 = String.valueOf(number);
        System.out.println(s2);
    //String -> int
        //方法1  先转成Integer对象, 再调用intvalue方法
        Integer i = Integer.valueOf(s);
        int x = i.intValue();
        System.out.println(x);

        //方法2 使用public static int parseInt(String s)方法
        int y = Integer.parseInt(s);
        System.out.println(y);




    }
}
