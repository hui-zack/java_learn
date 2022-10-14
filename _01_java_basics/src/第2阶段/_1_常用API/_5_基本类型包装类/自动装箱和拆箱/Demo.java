package 第2阶段._1_常用API._5_基本类型包装类.自动装箱和拆箱;

public class Demo {
    public static void main(String[] args) {
        //手动装箱
        Integer i = Integer.valueOf(100);
        //手动拆箱
        int i2 = i.intValue();

        //自动装箱
        Integer ii = 100;
        //自动拆箱
        int ii2 = ii;
    }
}
