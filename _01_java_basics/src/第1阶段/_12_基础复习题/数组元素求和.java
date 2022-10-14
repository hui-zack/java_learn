package 第1阶段._12_基础复习题;
//设计一个方法, 求出数组中满足要求的元素和, 要求是:求和的元素个位和十位都不能是7, 且只能是偶数

public class 数组元素求和 {
    public static void main(String[] args) {
        int[] arr = {68, 27, 95, 88, 171, 996, 51, 210};
        int result = arr_sum(arr);
        System.out.println(result);
    }

    public static int arr_sum(int[] arr) {
        int sum = 0;
        for (int x = 0; x < arr.length; x++) {
            if (arr[x] % 10 != 7 & arr[x] / 10 % 10 != 7 & arr[x] % 2 == 0) {
                sum += arr[x];
            }
        }
        return sum;
    }
}
