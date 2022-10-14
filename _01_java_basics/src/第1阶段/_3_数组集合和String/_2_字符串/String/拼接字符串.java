package 第1阶段._3_数组集合和String._2_字符串.String;

// 需求: 定义一个方法, 使用拼接, 把int数组中的数据按照指定的格式拼接成一个字符串返回, 调用该方法, 并在控制台输出结果
//      如数组为int[] arr = {1, 2, 3}, 返回[1,2,3]
/*
* 思路:
*   (1)定义一个int类型的数组, 用静态初始化完成数组元素的初始化
*   (2)定义一个方法, 把int数组中的数据按照指定格式拼接成一个字符串返回, 返回值类型是String
*   (3)调用方法, 用变量接受结果
*   (4)输出结果
* */
public class 拼接字符串 {
    public static void main(String[] args) {
        //定义一个int类型的数组, 用静态初始化完成数组元素的初始化
        int[] arr = {1, 2, 3 ,4};

        //调用方法, 用变量接受结果
        String str = arrayToString(arr);

        //输出结果
        System.out.println(str);

    }
    //定义一个方法, 把int数组中的数据按照指定格式拼接成一个字符串返回, 返回值类型是String
    public static String arrayToString(int[] arr) {
        String s = "";
        s += "[";
        for(int i=0; i<arr.length; i++) {
            if (i == arr.length -1) {
                s += arr[i];
            } else {
                s += arr[i];
                s += ",";
            }
        }
        s += "]";

        return s;
    }
}
