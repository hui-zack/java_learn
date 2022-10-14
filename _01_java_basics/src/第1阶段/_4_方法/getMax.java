package 第1阶段._4_方法;
// 需求: 设计一个方法, 返回数组的最大值
public class getMax {
    public static void main(String[] args) {
        int[] arr = {11, 102, 33, 65, 2, 76};
        int max = max(arr);
        System.out.println(max);
    }
    public static int max(int[] arr) {
        int max = arr[0];
        for(int i=1; i<arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }
}
