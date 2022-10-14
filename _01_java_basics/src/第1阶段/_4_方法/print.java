package 第1阶段._4_方法;
// 需求:设计python中的print方法
public class print {
    public static void main(String[] args) {
        print("张辉");
    }
    public static void print(String string) {
        System.out.println(string);
    }
    public static void print(int number) {
        System.out.println(number);
    }
    public static void print(boolean result) {
        System.out.println(result);
    }
}
