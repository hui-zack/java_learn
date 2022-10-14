package 第1阶段._12_基础复习题;
// 需求: 打印1-100间所有的逢7过的数据
/*
逢7过:
    包含7:
        个位是7
            num%10 == 7
        十位是7
            num/10%10 == 7
    7的倍数
        num%7 == 0
*/
public class 逢7过 {
    public static void main(String[] args) {
        for(int i=1; i<100; i++) {
            if(i%10==7 || i/10%10 == 7 || i%7 ==0) {
                System.out.println(i);
            }
        }
    }
}
