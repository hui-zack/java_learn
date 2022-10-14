package 第2阶段._2_异常._4_自定义异常;
//需求:
//    定义异常类 ScoreException
//    条件抛出  Teacher.checkScore()
//    使用异常  TeacherDemo
public class ScoreException extends Exception {
    public ScoreException() {};
    public ScoreException(String message) {
        super(message);     //一直传递到父父类的构造方法, 在那里有方法对其输出(如: getMessage()等)
    }
}
