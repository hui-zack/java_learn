package 第1阶段._12_基础复习题;

import java.util.Scanner;

// 需求: 根据元素查找数组索引值并返回, 若不存在返回-1
public class 查找 {
    public static void main(String[] args) {
        System.out.println("请输入要查找的数据:");
        //待查找的数组
        int[] arr = {11, 22, 33, 44, 55, 99};
        //键盘录取待查数据
        Scanner sc = new Scanner(System.in);
        int data = sc.nextInt();
        //调用方法查找
        int index = return_index(arr, data);
        System.out.println(index);
    }
    public static int return_index(int[] arr, int data) {
        for (int x=0; x<arr.length; x++) {
            if (data == arr[x]) {
                return x;
            }
        }
        return -1;
    }
}
