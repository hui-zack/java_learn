package 第2阶段._1_常用API._8_Random;
import java.util.Random;
public class randomDemo {
    public static void main(String[] args) {
        Random r = new Random();
        for(int i=1; i<1001; i++) {
            int number = r.nextInt(101);
            System.out.println("number:" + number);
        }
    }
}
