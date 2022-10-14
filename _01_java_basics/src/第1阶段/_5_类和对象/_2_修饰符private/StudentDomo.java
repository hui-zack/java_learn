package 第1阶段._5_类和对象._2_修饰符private;

public class StudentDomo {
    public static void main(String[] args) {
        //实例化对象
        Student s = new Student();
        //给类变量赋值
        s.name = "林青霞";
        s.setAge(121);

        s.show();
    }
}
