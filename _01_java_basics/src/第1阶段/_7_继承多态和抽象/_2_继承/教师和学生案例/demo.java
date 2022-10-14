package 第1阶段._7_继承多态和抽象._2_继承.教师和学生案例;

public class demo {
    public static void main(String[] args) {
        //不使用继承写的两个类
        Teacher t = new Teacher("林青霞", 22);
        System.out.println(t.getName() + t.getAge());
        t.teach();

        Student s = new Student("杨过", 16);
        System.out.println(s.getName() + s.getAge());
        s.learn();

        //使用继承写的两个类
        System.out.println("-------------------------");
        NewTeacher nt = new NewTeacher("林青霞", 22);
        System.out.println(nt.getName() + nt.getAge());
        nt.teach();

        NewStudent ns = new NewStudent("风清杨", 16);
        System.out.println(ns.getName() + ns.getAge());
        ns.learn();

    }
}
