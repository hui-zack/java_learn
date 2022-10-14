package 第1阶段._2_数据输入和流程控制;
//求1到100的偶数和
public class numberNum {
    public static void main(String[] arg) {
        int sum = 0;
        for(int i=1; i<101; i++) {
            if(i%2 == 0) {
                sum += i;
            }
        }
        System.out.println("和为:" + sum);
    }
}
