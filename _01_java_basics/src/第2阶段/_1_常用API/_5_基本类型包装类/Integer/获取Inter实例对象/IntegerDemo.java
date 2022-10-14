package 第2阶段._1_常用API._5_基本类型包装类.Integer.获取Inter实例对象;

public class IntegerDemo {
    public static void main(String[] args) {
        // 获取int的对象Integer
        Integer i1 = Integer.valueOf(123);
        System.out.println(i1);


        Integer i2 = Integer.valueOf("321");
        System.out.println(i2);

    }
}
