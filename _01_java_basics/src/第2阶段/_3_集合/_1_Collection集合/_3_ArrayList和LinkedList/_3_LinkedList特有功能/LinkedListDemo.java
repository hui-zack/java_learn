package 第2阶段._3_集合._1_Collection集合._3_ArrayList和LinkedList._3_LinkedList特有功能;

import java.util.LinkedList;

//需求: 创建LinkedList集合对象, 使用其特有的功能
/*
    public void addFirst(E e)
        在表头插入元素
    public void addLast(E e)
        表尾插入元素
    public E getFirst()
        返回第一元素
    public E getLast()
        返回最后一个元素
    public E removeFirst()
        删除并返回第一个元素
    public E removeLast()
        删除并返回最后一个元素
*/
public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();

        linkedList.add("hello");
        linkedList.add("world");
        linkedList.add("java");

        //public void addFirst(E e)
        linkedList.addFirst("你好");
        System.out.println(linkedList);

        System.out.println();
        // public void addLast(E e)
        linkedList.addLast("javaSE");
        System.out.println(linkedList);

        System.out.println();
        //public E getFirst()
        String s = linkedList.getFirst();
        System.out.println(s);

        System.out.println();
        //public E getLast()
        System.out.println(linkedList.getLast());



        System.out.println();
        //public E removeFirst()
        System.out.println(linkedList.removeFirst());
        System.out.println(linkedList);

        System.out.println();
        //public E removeLast()
        System.out.println(linkedList.removeLast());
        System.out.println(linkedList);

    }
}
