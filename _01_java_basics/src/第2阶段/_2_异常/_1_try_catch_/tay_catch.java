package 第2阶段._2_异常._1_try_catch_;
/*
需求: 使用try...catch...处理下表超范围异常
    try {
        可能出错误的代码;
    } catch {
        异常的处理代码;
    }
*/
public class tay_catch {
    public static void main(String[] args) {
        System.out.println("开始运行");
        method();
        System.out.println("结束运行");
    }
    public static void method() {
        /*int[] arr = {1, 2, 3};
        System.out.println(arr[3]);*/
        try {
            int[] arr = {1, 2, 3};
            System.out.println(arr[3]);
        } catch (ArrayIndexOutOfBoundsException ex) {
            ex.printStackTrace();   //打印异常, 但继续执行(当前页面不提示红!)
        }
    }
}
