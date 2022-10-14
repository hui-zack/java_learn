package 第2阶段._3_集合._1_Collection集合._4_Set._4_TreeSet.TreeSet无参Comparable.TreeSet无参构造;
//需求: 存储学生对象并遍历, 创建TreeSet集合使用带参构造方法
//     要求: 按照年龄从小到大排序, 年龄相同时, 按照姓名的字母顺序排序
import java.util.Iterator;
import java.util.TreeSet;

//使用TreeSet() 构造方法创建TreeSet集合, 填入int类型元素, 并遍历
public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet<Integer> ts =  new TreeSet<Integer>();

        ts.add(10);
        ts.add(40);
        ts.add(50);
        ts.add(30);
        ts.add(20);

        //迭代器遍历
        Iterator<Integer> it = ts.iterator();
        while (it.hasNext()) {
            Integer intData = it.next();
            System.out.println(intData);
        }

        System.out.println();
        //增强for循环遍历
        for (Integer integer : ts) {
            System.out.println(integer);
        }
    }
}
