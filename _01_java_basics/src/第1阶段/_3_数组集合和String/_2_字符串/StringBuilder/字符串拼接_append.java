package 第1阶段._3_数组集合和String._2_字符串.StringBuilder;
// 需求: 定义一个方法, 将int数组的数据按照指定的格式拼接成一个字符串返回, 调用该方法, 在控制台输出结果,
//       如:数组为int[] arr = {1, 2, 3}, 指定方法后的输出结果为[1, 2, 3]
/*
 * 思路
 *   (1)定义一个int类型的数组, 使用静态初始化完成数组元素的初始化
 *   (2)定义一个方法, 将int数组中的数据按照指定的格式拼接成一个字符串返回, 返回值类型为String, 参数为int数组
 *   (3)在方法中用StirngBuiler按照要求进行拼接, 把结果转成String返回
 *   (4)调用方法, 用一个变量接受结果
 *
 * */

public class 字符串拼接_append {
    public static void main(String[] args) {
        //(1)定义一个int类型的数组, 使用静态初始化完成数组元素的初始化
        int[] arr = {1, 2, 3};

        //(4)调用方法, 用一个变量接受结果
        String s = arrayToString(arr);
        System.out.println(s);
    }

    //(2)定义一个方法, 将int数组中的数据按照指定的格式拼接成一个字符串返回, 返回值类型为String, 参数为int数组
    public static String arrayToString(int[] arr) {
        //(3)在方法中用StirngBuiler按照要求进行拼接, 把结果转成String返回
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                sb.append(arr[i]);
            } else {
                sb.append(arr[i]).append(", ");
            }
        }
        sb.append("]");

        return sb.toString();
    }
}
