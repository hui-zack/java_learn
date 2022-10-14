package 第1阶段._7_继承多态和抽象._2_继承.教师和学生案例;

public class NewTeacher extends Person{

    public NewTeacher() {
    }

    public NewTeacher(String name, int age) {
        super(name, age);
    }

    public void teach() {
        System.out.println("用爱成就每一位学员");
    }

}
