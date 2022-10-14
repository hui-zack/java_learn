package 第2阶段._4_泛型._1_泛型类;
//需求: 定义一个泛型类, 并在Demo中使用
public class Demo {
    public static void main(String[] args) {
        Generic<String> g1 = new Generic<String>();
        g1.set("林青霞");
        System.out.println(g1.getT());

        Generic<Integer> g2 = new Generic<Integer>();
        g2.set(123);
        System.out.println(g2.getT());




    }
}
