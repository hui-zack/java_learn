package 第2阶段._4_泛型._4_类型通配符;
// 需求: 使用类型通配符限制元素范围
/*
继承关系:
    Object
        Number
            Integer
*/
import java.util.ArrayList;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {
        //不限范围
        List<?> l1 = new ArrayList<Object>();

        //限制元素范围 <= Number
        List<? extends Number> l2 = new ArrayList<Number>();
        //限制元素范围 <= Number, Integer是Number子类, 不报错
        List<? extends Number> l3 = new ArrayList<Integer>();

        //限制元素范围 >= Number
        List<? super Number> l4 = new ArrayList<Number>();
        //限制元素范围 >= Number, Object是Number父类, 不报错
        List<? super Number> l5 = new ArrayList<Object>();
    }
}
