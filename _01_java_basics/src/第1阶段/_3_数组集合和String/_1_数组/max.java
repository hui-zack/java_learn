package 第1阶段._3_数组集合和String._1_数组;

public class max {
    public static void main(String[] args) {
        int[] arr = {11, 22, 33, 100, 55, 66, 77, 88};
        int max = arr[0];
        for(int i=1; i<arr.length; i++) {
            if(arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("max:" + max);
    }
}
