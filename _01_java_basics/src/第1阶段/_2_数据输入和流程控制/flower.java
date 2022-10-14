package 第1阶段._2_数据输入和流程控制;
// 水仙花数是一个三位数, 其个位,十位,百位的数字立方和等于原数字

public class flower {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int num = sc.nextInt();
//
//        int num_ge = num%10;
//        int num_shi = num/10%10 ;
//        int num_bai = num/100%10;
//
//        if(num_ge*num_ge*num_ge + num_shi*num_shi*num_shi + num_bai*num_bai*num_bai == num ) {
//            System.out.println(num + "是水仙花数");
//        } else {
//            System.out.println(num + "不是水鲜花数");
//        }
        int count = 0;
        for(int i=100; i<1000; i++) {
            int num_ge = i%10;
            int num_shi = i/10%10 ;
            int num_bai = i/100%10;

            if(num_ge*num_ge*num_ge + num_shi*num_shi*num_shi + num_bai*num_bai*num_bai == i) {
                count += 1;
                System.out.println(i);
            }
        }
        System.out.println("一共有" + count + "个水仙花数");
    }
}
