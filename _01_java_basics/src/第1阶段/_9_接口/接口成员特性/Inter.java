package 第1阶段._9_接口.接口成员特性;
//需求: 用来探究接口中成员变量, 构造方法, 成员方法的情况
public interface Inter {
    //测试接口成员变量
    public int num = 10;
    public final int num2 = 20;
    public static final int num3 = 30;

    //测试接口构造方法
    //public FhilipROI.Inter(){};  //无参构造报错,
    //结论: 接口中不能有构造方法

    //测试接口的成员方法
    /*
    public void show() {
        System.out.println("aa");
    }
    */    //报错, 错误显示接口中方法为抽象方法, 不能有方法体
    public abstract void eat();
    //第一阶段.接口: 接口中的成员方法默认为抽象方法, 且必须为抽象方法. 默认修饰符号 public abstract , 且不能使用静态修饰符static修饰


}
