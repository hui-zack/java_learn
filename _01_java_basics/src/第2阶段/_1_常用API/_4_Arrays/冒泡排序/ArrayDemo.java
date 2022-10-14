package 第2阶段._1_常用API._4_Arrays.冒泡排序;



public class ArrayDemo {
    public static void main(String[] args) {
        int arr[] = {22, 14, 32, 56, 41};
        bubbleSort(arr);
    }

    // 冒泡排序, 打印出String类型的好看输出
    public static void bubbleSort(int[] arr) {
        for (int x = 0; x < arr.length-1; x++) {
            for (int i = 0; i < arr.length-1-x; i++) {
                if (arr[i] > arr[i+1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
        }
        System.out.println(arrayToString(arr));
    }

    // 数组转字符串, 并好看返回
    public static String arrayToString(int[] arr) {
        StringBuilder sb = new StringBuilder();

        sb.append("[");
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                sb.append(arr[i]);
            } else {
                sb.append(arr[i]).append(",");
            }
        }
        sb.append("]");
        String s = sb.toString();

        return s;
    }

}
