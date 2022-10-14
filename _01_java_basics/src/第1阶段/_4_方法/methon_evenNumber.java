package 第1阶段._4_方法;
// 需求: 写一个方法, 接受一个参数, 判断是否是偶数
public class methon_evenNumber {
    public static void main(String[] args) {
        evenNumer(101);
    }
    public static void evenNumer(int number) {
        System.out.println(number % 2 == 0);
    }
}
