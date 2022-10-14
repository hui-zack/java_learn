package 第1阶段._3_数组集合和String._2_字符串.StringBuilder;
// 需求: 检测Stringbuilder的构造方法
/*
*
*
*
* */
public class Stringbuiler构造方法 {
    public static void main(String[] args) {
        //public StringBuiler()
        StringBuilder strb = new StringBuilder();
        System.out.println("strb:" + strb);
        System.out.println("strb.length():" + strb.length());

        //public StringBuiuler(String s)
        String s = "hdjksfh";
        StringBuilder strb2 = new StringBuilder(s);
        System.out.println("strb2:" + strb);
        System.out.println("strb2.length():" + strb2.length());
    }
}
