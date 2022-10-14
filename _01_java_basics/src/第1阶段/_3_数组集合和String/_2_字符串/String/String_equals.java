package 第1阶段._3_数组集合和String._2_字符串.String;
//需求: 使用直接构造方法和字符构造方法分别创建两个字符串, 一个四个,
//     使用 == 和equals() 进行比较
public class String_equals {
    public static void main(String[] args) {
        // 使用char[] 创建字符串对象
        char[] chs = {'a', 'c', 'b', '3'};
        String s1 = new String(chs);
        String s2 = new String(chs);

        System.out.println(s1 == s2);       // == 比较地址
        System.out.println(s1.equals(s2));  // equals 比较内容

        System.out.println("--------------");

        // 使用""创建字符串对象
        String s3 = "acb3";
        String s4 = "acb3";
        System.out.println(s3 == s4);
        System.out.println(s3.equals(s4));

    }
}
