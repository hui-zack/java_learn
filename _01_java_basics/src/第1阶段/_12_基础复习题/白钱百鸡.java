package 第1阶段._12_基础复习题;
//需求: 公鸡5元一只, 母鸡3元一只, 小鸡1元三只, 用一百元钱买100只鸡, 问公鸡, 母鸡, 小鸡各几只?
/*
* 公鸡x 母鸡y 小鸡z
* x + y + z == 100 只
* x*5 Y*3 +z/3 == 100 元
* x<=20 y<=33 z<=100
* */
public class 白钱百鸡 {
    public static void main(String[] args) {
        System.out.println("---------");
        int x, y, z;
        for(x=0; x<=20; x++) {
            for(y=0; y<=33; y++) {
                for(z=0; z<=100; z++) {
                    if (x + y + z == 100 && x*5 + y*3 + z/3 == 100 && z%3 == 0) {
                        System.out.println("x:" + x);
                        System.out.println("y:" + y);
                        System.out.println("z:" + z);
                        System.out.println("---------");
                    }
                }
            }
        }
    }
}

