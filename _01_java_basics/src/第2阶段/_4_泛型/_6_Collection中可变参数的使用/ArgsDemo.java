package 第2阶段._4_泛型._6_Collection中可变参数的使用;


import java.util.*;

//需求: 使用三种构造特殊集合的方法构建集合,
/*
三种方法
    public static <T> List<T> asList<T... a>
        返回长度固定的List集合, 不能增删, 能修改
    public static <T> List<T> of(E... element)
        返回不可变列表,  不能增删改
    public static <E> Set<E> (E...elements)
        返回不可变Set集合, 不能增删改, 添加重复元素会报错
*/
public class ArgsDemo {
    public static void main(String[] args) {
        //使用Arrays.asList(T... a)方法构建固定长度列表
        List<String> lst = Arrays.asList("hello", "world", "java");
        lst.set(1, "people");
        System.out.println(lst);

        //使用List.of(E... elements)方法构建不可变列表
        List<String> lst1 = List.of("hello", "world", "java");
        System.out.println(lst1);

        //使用Set.of方法()构建集合不可变集合
        Set<String> st = Set.of("hello", "world", "java");
        System.out.println(st);


    }
}
