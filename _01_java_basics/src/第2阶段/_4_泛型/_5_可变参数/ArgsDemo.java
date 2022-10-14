package 第2阶段._4_泛型._5_可变参数;
//需求: 定义两个可变参数方法并使用
public class ArgsDemo {
    public static void main(String[] args) {
        System.out.println(sum(1, 2, 3, 4, 5));
        System.out.println(sum("求和:",1, 2, 3, 4, 5));
    }

    public static int sum (int... a) {
        int sum = 0;

        for (int i : a) {
            sum += i;
        }
        return sum;
    }

    public static int sum(String s, int... a) {
        int sum = 0;

        for (int i : a) {
            sum += i;
        }

        System.out.println(s);
        return sum;
    }
}
