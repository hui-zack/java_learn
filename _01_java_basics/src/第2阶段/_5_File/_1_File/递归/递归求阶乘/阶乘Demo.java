package 第2阶段._5_File._1_File.递归.递归求阶乘;

// 使用递归的实现编写一个求阶乘的方法
/*
思路:
    (1) 定义一个方法, 用于递归求阶乘
    (2) 在方法内部判断该变量的值是否是1:
        是: 返回 1
        否: 返回 n * n-1
    (3) 调用方法
    (4) 输出结果
*/
public class 阶乘Demo {
    public static void main(String[] args) {
        System.out.println(factorial(5));
    }

    public static int factorial(int i) {
        if (i == 1) {
            return 1;
        } else {
            return i * factorial(i - 1);
        }
    }
}
