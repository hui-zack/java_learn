package 第1阶段._3_数组集合和String._2_字符串.String;
// 需求:已知用户名和密码, 请用程序模拟用户登录.总共给三次机会. 登录后给出相应的提示
import java.util.Scanner;

public class 用户登录 {
    public static void main(String[] args) {
        String username = "hui";
        String passwd = "123456";

        int time_in = 2;
        for (int i=1; i<4; i++) {
            Scanner sc = new Scanner(System.in);
            System.out.print("账号:");
            String username_in = sc.nextLine();
            System.out.print("密码:");
            String passwd_in = sc.nextLine();
            if (username.equals(username_in) && passwd.equals(passwd_in)) {
                System.out.println("登录成功!");
                break;
            } else {
                if (time_in == 0) {
                    System.out.println("账户已被锁定, 请与管理员联系!!");
                } else {
                    System.out.println("输入错误, 重新输入(你还有" + time_in + "次机会)");
                }
                time_in--;
            }
        }
    }
}
