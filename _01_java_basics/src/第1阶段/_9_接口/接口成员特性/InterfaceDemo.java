package 第1阶段._9_接口.接口成员特性;

public class InterfaceDemo {
    public static void main(String[] args) {
        //测试接口的成员变量
        Inter i = new InterImpl();
        //i.num = 10; //报错
        System.out.println(i.num);
        System.out.println(i.num2);
        System.out.println(i.num3);
        // 结论: 接口中成员变量默认修饰符: public static final



    }
}
