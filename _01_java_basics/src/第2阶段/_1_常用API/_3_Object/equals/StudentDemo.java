package 第2阶段._1_常用API._3_Object.equals;
//需求: 使用Student中重写的equals方法比较内容
public class StudentDemo {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setName("曹飞雨");
        s1.setAge(18);
        System.out.println(s1.toString());

        Student s2 = new Student();
        s2.setName("曹飞雨");
        s2.setAge(18);
        System.out.println(s2.toString());

        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));

    }
}
