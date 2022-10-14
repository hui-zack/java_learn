package 第1阶段._3_数组集合和String._1_数组;

public class arrayDemo {
    public static void main(String[] args) {
        //动态初始化  元素都赋0
        int[] arr = new int[3];
            /*
            左边:
                int: 数组元素类型为int
                []:  说明是个数组
                arr: 数组名
            右边:
                new: 申请内存空间
                int: 数组元素类型为int
                []:  说明是个数组
                3:   数组长度
            */

        //输出数组名:
        System.out.println(arr);    //结果[I@16b98e56 为内存地址
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);

        int[] arr2 = {122, 133, 144};
        System.out.println("--------------");
        System.out.println(arr2[1]);

    }
}
