package 第1阶段._12_基础复习题;

// 需求: 设计方法:将数组的所有元素反转并输出新数组
/*
 * 1 2 3 4 5 6
 * 0 1 2 3 4 5
 * */
public class 反转 {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 8, 22};
        reversal(arr);

    }

    public static void reversal(int[] arr) {
        //数组反转
        for (int start=0, end=arr.length-1; start<=end; start++, end--) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

        }
        //数组好看输出
        System.out.print("[");
        for (int x=0; x< arr.length; x++) {
            if (x == arr.length-1){
                System.out.print(arr[x]);
            } else {
                System.out.print(arr[x] + ", ");
            }
        }
        System.out.println("]");
        System.out.println("成功!");
    }
}


