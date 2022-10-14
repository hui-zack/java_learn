package 第2阶段._3_集合._1_Collection集合._4_Set._4_TreeSet.成绩排序案例;
// 需求: 用TreeSet集合存储多个学生信息(姓名, 语文成绩, 数学成绩), 并遍历该集合
//      要求:按照总分从高到低出现
/*
思路:
    1. 定义学生类
    2. 创建TreeSet集合对象, 通过比较器进行排序
    3. 创建学生对象
    4. 把学生对象添加到集合
    5. 遍历集合
*/

public class Student  {     //implements Comparable<Student>
    private String name;
    private int chinese_score;
    private int math_score;

    public Student() {
    }

    public Student(String name, int chinese_score, int math_score) {
        this.name = name;
        this.chinese_score = chinese_score;
        this.math_score = math_score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getChinese_score() {
        return chinese_score;
    }

    public void setChinese_score(int chinese_score) {
        this.chinese_score = chinese_score;
    }

    public int getMath_score() {
        return math_score;
    }

    public void setMath_score(int math_score) {
        this.math_score = math_score;
    }

    public int getSum_score() {
        return this.chinese_score + this.math_score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", chinese_score=" + chinese_score +
                ", math_score=" + math_score +
                '}';
    }

    /*
    @Override
    public int compareTo(Student s) {
        int num = this.getSum_score() - s.getSum_score();
        int num2 == 0 ? this.chinese_score - s.chinese_score : num;
        int num3 == 0 && num2 ==0 ? this.math_score - s.math_score : num;
        return -num3;
    }
    */
}
