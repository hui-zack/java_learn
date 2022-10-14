package 第1阶段._12_基础复习题;
// 需求: 一对兔子, 出生三个月后每个月都生一对兔子, 小兔子到第三个月以后每个月也会生一堆兔子, 假如兔子都不死, 请计算20个月以后有多少对兔子?
/*i
* 第一个月: 1
* 第二个月: 1
* 第三个月: 2
* 第四个月: 3
* 第五个月: 5
*
* arr[0] = 1;
* arr[1] = 1;
* arr[x] = arr[x-1] + arr[x-2];
* */
public class 不死神兔 {
    public static void main(String[] args) {
        // 定义一个长度20的动态变量
        int[] arr = new int[20];

        arr[0] = 1;
        arr[1] = 1;
        for(int x=2; x<arr.length; x++) {
            arr[x] = arr[x-1] + arr[x-2];
        }
        System.out.println(arr[19]);
    }
}
