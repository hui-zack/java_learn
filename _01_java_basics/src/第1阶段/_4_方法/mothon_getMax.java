package 第1阶段._4_方法;
// 需求: 设计输出10和20中最大值的方法
public class mothon_getMax {
    public static void main(String[] args) {
        getMax();
    }
    public static void getMax() {
        int a = 10;
        int b = 20;
        int max = a>b ? a:b;
        System.out.println("max:" + max);
    }
}
