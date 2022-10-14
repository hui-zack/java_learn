package 第1阶段._5_类和对象._3_标准类和this;

public class StudentDemo {
    public static void main(String[] args) {
        Student s = new Student();
        Student s1 = s;
        System.out.println(s1);
        System.out.println(s);


        s.setAge(19);
        s.setName("张曼玉");

        String name = s.getName();
        int age = s.getAge();
        System.out.println(name + ":" + age);
    }
}
