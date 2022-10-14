package _2_JDBC._1_JDBC基础._5_数据库实现网页登录案例._1_statement实现_可注入;
// 需求: 使用jdbc调用用户数据完成网页登录逻辑代码
/*
* 执行结果使用sql注入语句注入:
* username: fjdsaf
* password:
* */
import _2_JDBC.utils.JDBCUtils;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Statement_Login_Demo {
    //键盘输入账号密码登录
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("username : ");
        String username = sc.nextLine();
        System.out.println("password : ");
        String password = sc.nextLine();

        Statement_Login_Demo ld = new Statement_Login_Demo();
        boolean loginStatus = ld.login(username, password);     //登录判断

        if (loginStatus){
            System.out.println("登录成功");
        } else {
            System.out.println("账号或密码错误");
        }
    }

    // 连接数据库 判断输入的账号密码是否正确
    public boolean login(String username, String password){
        if (username == null || password == null){
            return false;
        }
        username = username.replace(" ", "");
        password = password.replace(" ", "");
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        try {
            conn = JDBCUtils.getConnection();
            stmt = conn.createStatement();

            String sql = "select * from user where username = '%s' and password = '%s'".formatted(username, password);
            rs = stmt.executeQuery(sql);

            return rs.next();                       //有数据返回真
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            JDBCUtils.close(rs, stmt, conn);
        }

        return false;
    }
}
