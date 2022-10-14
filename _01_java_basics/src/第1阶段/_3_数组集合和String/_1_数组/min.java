package 第1阶段._3_数组集合和String._1_数组;

public class min {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 9, 23, 43, 5};
        int min = arr[0];
        for(int i=1; i<arr.length; i++) {
            if(arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("min:" + min);
    }
}
