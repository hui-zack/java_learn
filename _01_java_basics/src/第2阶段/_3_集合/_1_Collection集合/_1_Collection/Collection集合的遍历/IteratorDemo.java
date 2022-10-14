package 第2阶段._3_集合._1_Collection集合._1_Collection.Collection集合的遍历;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

// 需求: 创建一个Collection集合并添加元素, 然后用Iterator()获取迭代器对象, 然后调用next()和hasNext()方法遍历集合
public class IteratorDemo {
    public static void main(String[] args) {
        //搞一个Collection的集合
        Collection<String> c = new ArrayList<>();
        c.add("hello");
        c.add("world");
        c.add("java");

        //通过Collection的iterator()方法获取迭代器对象, 并遍历
        Iterator<String> it = c.iterator();
        while (it.hasNext()) {
            String s = it.next();
            System.out.println(s);
        }


    }
}
