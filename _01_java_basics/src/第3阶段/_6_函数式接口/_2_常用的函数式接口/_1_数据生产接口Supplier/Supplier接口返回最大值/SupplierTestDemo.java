package 第3阶段._6_函数式接口._2_常用的函数式接口._1_数据生产接口Supplier.Supplier接口返回最大值;

import java.util.function.Supplier;

//需求:
//  定义一个类(SupplierTestDemo), 在类提供两个方法
//      int getMax*(Supplier<Integer> sup)
//      main
public class SupplierTestDemo {
    public static void main(String[] args) {
        int[] arr = {19, 50, 28, 37, 46};

        int num = getMax( () -> {                                 //重写接口返回最大值
           int max = arr[0];
           for (int i = 1; i < arr.length; i++){
               if (arr[i] > max) {
                   max = arr[i];
               }
           }
           return max;
        });

        System.out.println(num);

    }
    private static Integer getMax(Supplier<Integer> sup) {
        return sup.get();
    }
}
