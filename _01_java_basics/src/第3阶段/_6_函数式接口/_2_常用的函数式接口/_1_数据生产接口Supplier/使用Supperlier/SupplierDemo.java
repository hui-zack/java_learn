package 第3阶段._6_函数式接口._2_常用的函数式接口._1_数据生产接口Supplier.使用Supperlier;

import java.util.function.Supplier;

public class SupplierDemo {

    public static void main(String[] args) {
        int str1 = getInteger(new Supplier<Integer>() {
            @Override
            public Integer get() {
                return 11223;
            }
        });
        System.out.println(str1);

        int num = getInteger(() -> 10086);
        String str = getString( () -> "张辉");
        System.out.println(num + " " + str);
    }

    private static Integer getInteger(Supplier<Integer> sup){
        return sup.get();
    }

    private static String getString(Supplier<String> sup) {
        return sup.get();
    }
}
