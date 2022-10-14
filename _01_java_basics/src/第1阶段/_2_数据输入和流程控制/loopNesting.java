package 第1阶段._2_数据输入和流程控制;
// 输出一天所有的小时和分钟
public class loopNesting {
    public static void main(String[] args) {
        for (int i = 1; i < 25; i++) {
            int j = 0;
            while (j < 61) {
                System.out.println(i + "时" + j + "分");
                j++;
            }
        }
    }
}