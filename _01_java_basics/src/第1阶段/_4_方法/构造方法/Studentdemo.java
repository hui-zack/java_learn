package 第1阶段._4_方法.构造方法;

public class Studentdemo {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.show();

        Student s2 = new Student("曹飞雨");
        s2.show();

        Student s3 = new Student(22);
        s3.show();

        Student s4 = new Student("曹飞雨", 22);
        s4.show();
    }
}
