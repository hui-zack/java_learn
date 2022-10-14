package 第2阶段._2_异常._4_自定义异常;

import java.util.Scanner;

//需求:
//    定义异常类 ScoreException
//    条件抛出  Teacher.checkScore()
//    使用异常  TeacherDemo
public class TeacherDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入要检查的分数:");
        int score = sc.nextInt();

        //使用异常/异常处理
        try {
            Teacher.checkScore(score);
        } catch (ScoreException e) {
            e.printStackTrace();
        }

        System.out.println("检查完毕");
    }
}
