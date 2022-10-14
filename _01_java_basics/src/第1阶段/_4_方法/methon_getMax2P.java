package 第1阶段._4_方法;
// 需求:定义一个有两个参数的方法, 比较并输出最大值
public class methon_getMax2P {
    public static void main(String[] args) {
        getMax(89, 393);
    }
    public static void getMax(int number1, int number2) {
        int max = number1>number2 ? number1:number2;
        System.out.println("max:" + max);
    }
}
