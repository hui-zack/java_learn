package 第1阶段._3_数组集合和String._3_Arraylist.存储学生对象并遍历;
//需求: 定义学生类

public class Student {

    private String name;
    private String age;

    //构造方法
    public Student() {}
    public Student(String name, String age) {
        this.name = name;
        this.age = age;
    }
    // 普通方法
    public String getName() {
        return this.name;
    }

    public String getAge() {
        return this.age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setage(String age) {
        this.age = age;
    }

}
