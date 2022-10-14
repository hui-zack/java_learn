package 第1阶段._5_类和对象._4_标准类总结制作;

public class PhoneDemo {
    public static void main(String[] args) {
        //实例化对象, 无参构造
        Phone huawei_p40 = new Phone();
        huawei_p40.show();

        huawei_p40.setBrand("huawei");
        huawei_p40.setPrice(6988);
        huawei_p40.show();

        //实例化对象, 全参构造
        Phone huawei_p30 = new Phone("huawei", 4988);
        huawei_p30.show();
    }
}
