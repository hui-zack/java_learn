package 第1阶段._3_数组集合和String._2_字符串.String;

public class String_create {
    public static void main(String[] args) {
        //直接创造
        String s1 = "abc";
        System.out.println("s1:" + s1);

        //根据 public String(char[] chs) {...} 构造
        char[] chs = {'a', 'b', 'c'};
        String s3 = new String(chs);
        System.out.println("s3:" + s3);

        //根据 public String(byte[] bys) {...} 构造
        byte[] bys = {97, 98, 99};
        String s4 = new String(bys);
        System.out.println("s4:" + s4);

        //根据 public String() {...} 构造空字符串
        String s2 = new String();
        System.out.println("s2:" + s2);


    }


}
