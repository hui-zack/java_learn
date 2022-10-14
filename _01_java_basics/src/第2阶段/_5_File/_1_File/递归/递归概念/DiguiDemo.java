package 第2阶段._5_File._1_File.递归.递归概念;

// 使用递归求不死神兔问题

public class DiguiDemo {
    public static void main(String[] args) {
        int[] arr = new int[20];

        arr[0] = 1;
        arr[1] = 1;

        for (int i = 2; i < arr.length; i++){
            arr[i] = arr[i-1] + arr[i - 2];
        }

        System.out.println(arr[19]);
        System.out.println(f(20));
    }

    public static int f(int n) {
        if (n == 1 || n == 2) {
            return 1;
        } else {
            return f(n -1) + f(n - 2);
        }

    }
}
