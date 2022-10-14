package 第1阶段._5_类和对象._1_定义和使用;

/*
需求: 使用类phone
    创建实例对象;
    使用成员变量;
    使用成员方法;
    */
public class PhoneDemo {
    public static void main(String[] args) {
        //创建对象
        Phone huawei_p40 = new Phone();
        //查看类变量原始值
        System.out.println(huawei_p40.brand + " " + huawei_p40.price);
        //使用变量
        huawei_p40.price = 2999;
        huawei_p40.brand = "华为";
        System.out.println(huawei_p40.brand + " " + huawei_p40.price);
        //使用方法
        huawei_p40.call();
        huawei_p40.shortMassage();
    }

}
