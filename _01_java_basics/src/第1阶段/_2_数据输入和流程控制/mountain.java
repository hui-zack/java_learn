package 第1阶段._2_数据输入和流程控制;
//珠穆朗玛峰8844.43米(8844430毫米), 一张纸的厚度是0.1毫米, 问纸者多少次可以折成珠峰高度?
public class mountain {
    public static void main(String[] args) {
        float mountain = 8844430F;
        float paper = 0.1F;

        int time = 0;
        while(paper <= mountain) {
            paper *= 2;
            time++;
        }
        System.out.println(time);
    }

}
