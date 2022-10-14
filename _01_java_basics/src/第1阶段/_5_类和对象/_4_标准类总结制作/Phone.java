package 第1阶段._5_类和对象._4_标准类总结制作;

// 需求: 根据标准类框架制作一个手机类
/*标准类制作:
        1.类变量
        使用private修饰
        2.构造方法
        提供一个无参构造方法
        提供一个带多个参数的构造方法
        3.成员方法
        提供成员变量的setXxx()和getXxx();
        提供显示对象信息的show()第一阶段.类和对象.方法;
        4.创建对象并为成员变量赋值的两种方式
        无参构造后使用setXxx赋值;
        使用带参构造方法赋值;
        */
public class Phone {
    private String brand;
    private int price;

    //构造方法
    public Phone() {};
    public Phone(String brand, int price) {
        this.brand = brand;
        this.price = price;
    }

    //成员方法
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public void setPrice(int price) {
        this.price = price;
    }

    public String  getBrand() {
        return brand;
    }
    public int getPrice() {
        return price;
    }

    // 普通方法
    public void show() {
        System.out.println(brand + ", " + price);
    }

}
