package 第1阶段._1_basicGrammar;

// 三个和尚 身高分别为150cm, 210cm, 165cm 用程序实现获取他们的最高身高
public class threeHeshang {
    public static void main(String[] args) {
        int monk1 =150, monk2 = 210, monk3 = 165;
        int maxTmp = monk1 > monk2 ? monk1:monk2;
        int max = (monk3 > maxTmp ? monk3:maxTmp);
        System.out.println("三个和尚的最高身高为:" + max);
    }
}
