package 第2阶段._1_常用API._4_Arrays.使用工具类排序;
//  需求:使用Array工具类的sort方法对int数组进行排序
import java.util.Arrays;

public class ArraysDemo {
    public static void main(String[] args) {
        int arr[] = {1, 5, 3, 9, 7};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
