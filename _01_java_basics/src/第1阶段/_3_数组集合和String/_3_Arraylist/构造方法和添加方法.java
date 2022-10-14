package 第1阶段._3_数组集合和String._3_Arraylist;
//需求:

import java.util.ArrayList;

public class 构造方法和添加方法 {
    public static void main(String[] args) {
        //Public ArrarList() 创建一个空的集合对象
        ArrayList<String> array = new ArrayList<>();
        ArrayList<String> array1 = new ArrayList<String>();

        //添加方法  .add(E e)
        array.add("hello");
        array.add("world");
        array.add("java");
        System.out.println(array);

        //添加方法  .add(int index, E e);
        array.add(1, "javase");

        System.out.println("arrat:" + array);
    }


}
