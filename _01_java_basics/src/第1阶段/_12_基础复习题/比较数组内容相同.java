package 第1阶段._12_基础复习题;
// 需求: 设计一个方法, 用该方法比较两个数组是否相同并返回真假
public class 比较数组内容相同 {
    public static void main(String[] args) {
        int[] arr1 = {11, 22, 33, 44, 55, 66};
        int[] arr2 = {11, 22, 33, 44, 55, 66};
        boolean result1 = my_arr_same(arr1, arr2);
        boolean result2 = teacher_arr_same(arr1, arr2);
        System.out.println("my_arr_same:" + result1);
        System.out.println("teacher_arr_same:" + result2);
    }
    public static boolean teacher_arr_same(int[] arr1, int[] arr2){
        if (arr1.length != arr2.length) {
            return false;
        }
        for (int x=0; x<arr1.length; x++) {
            if (arr1[x] != arr2[x]) {
                return false;
            }
        }
        return true;

    }
    public static boolean my_arr_same(int[] arr1, int[] arr2) {
        if (arr1.length == arr2.length) {
            int time = 0;
            for (int x = 0; x < arr1.length; x++) {
                for (int y = 0; y < arr2.length; y++) {
                    if (x == y && arr1[x] == arr2[y]) {
                        time++;
                    }
                }
            }
            if (time == arr1.length) {
                return true;
            } else {
                return false;
            }

        } else {
            return false;
        }
    }
}
