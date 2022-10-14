package 第2阶段._2_异常._2_Throwable常用方法;
/*
需求: 对数组下标超范围做出异常处理, 并使用getMessage()方法, toString()方法, 和printStackTrace()方法
public String getMessage()
            返回throwable的详细字符串
        public String toString()
            返回可抛出的简短描述
        public void printStackTrace()
            将异常的信息输出到控制台
*/
public class Throwable常用方法 {
    public static void main(String[] args) {
        System.out.println("开始");
        method();
        System.out.println("结束");
    }

    public static void method() {
        try {
            int[] arr = {1, 2, 3};
            System.out.println(arr[3]);
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println(ex.getMessage());    //getMessage()方法
            System.out.println(ex.toString());      //toString()方法
            ex.printStackTrace();                   //printStackTrace()方法
        }
    }
}
