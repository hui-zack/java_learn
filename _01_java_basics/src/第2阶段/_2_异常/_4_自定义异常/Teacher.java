package 第2阶段._2_异常._4_自定义异常;
//需求:
//    定义异常类 ScoreException
//    条件抛出  Teacher.checkScore()
//    使用异常  TeacherDemo

public class Teacher {
    public static void checkScore(int score) throws ScoreException {
        if (score<0 | score > 100) {
            throw new ScoreException("分数不在0-100范围内");
        } else {
            System.out.println("分数正常...");
        }
    }
}
