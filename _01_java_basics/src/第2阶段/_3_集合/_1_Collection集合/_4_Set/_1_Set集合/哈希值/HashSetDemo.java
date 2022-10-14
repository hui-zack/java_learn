package 第2阶段._3_集合._1_Collection集合._4_Set._1_Set集合.哈希值;
// 获取对象的哈希值
public class HashSetDemo {
    public static void main(String[] args) {
        Student s1 = new Student("张辉", 22);
        Student s2 = new Student("张辉", 22);

        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());

        System.out.println();
        System.out.println("hello".hashCode());
        System.out.println("hello".hashCode());
        System.out.println("world".hashCode());

        System.out.println();
        System.out.println("张辉".hashCode());
        System.out.println("重地".hashCode());
        System.out.println("通话".hashCode());

    }
}
