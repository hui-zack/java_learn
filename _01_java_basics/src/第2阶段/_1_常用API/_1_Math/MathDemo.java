package 第2阶段._1_常用API._1_Math;


public class MathDemo {


    public static void main(String[] args) {

        //public static int abs(int a): 返回a的绝对值
        System.out.println(Math.abs(34));
        System.out.println(Math.abs(-34));
        System.out.println("-------------------------");
        //public static ceil(double a): 返回>=a的最小整数
        System.out.println(Math.ceil(12.34));
        System.out.println(Math.ceil(12.99));
        System.out.println("-------------------------");
        //public static floor(double a): 返回<=a的最大整数
        System.out.println(Math.floor(18.33));
        System.out.println(Math.floor(18.95));
        System.out.println("-------------------------");
        //public static int round (float a): 返回a四舍五入后的值
        System.out.println(Math.round(14.32F));
        System.out.println(Math.round(14.56));
        System.out.println("-------------------------");
        //public static int max(int a, int b): 返回较大的值
        System.out.println(Math.max(14.33, 22.153));
        System.out.println("-------------------------");
        //public static int min(int a, int b): 返回较小的值
        System.out.println(Math.min(22, 33));
        System.out.println("-------------------------");
        //public static double pow(double a, double b): 返回a的b次幂
        System.out.println(Math.pow(2, 3));
        System.out.println("-------------------------");
        //public static double random(): 返回(0,1)的随机值
        System.out.println(Math.random());

    }
}
