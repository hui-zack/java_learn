package 第1阶段._4_方法;

public class arr_traversel {
    public static void main(String[] args) {
        int[] arr = {11, 22, 33, 44, 55};
        arrT(arr);
    }
    public static void arrT(int[] arr) {
        System.out.print("[");
        for(int x=0; x<arr.length; x++) {
            if (x == arr.length - 1) {
                System.out.print(arr[x]);
            } else {
                System.out.print(arr[x] + ", ");
            }
        }
        System.out.println("]");
    }
}
