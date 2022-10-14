package 第1阶段._7_继承多态和抽象._2_继承.教师和学生案例;

public class NewStudent extends Person {

    public NewStudent() {
    }

    public NewStudent(String name, int age) {
        super(name, age);
    }

    public void learn() {
        System.out.println("好好学习, 天天向上");
    }
}
