package _2_JDBC._1_JDBC基础._5_数据库实现网页登录案例._3_PreparedStatement_防注入;

import _2_JDBC.utils.JDBCUtils;
import _2_JDBC._1_JDBC基础._5_数据库实现网页登录案例._1_statement实现_可注入.Statement_Login_Demo;

import java.sql.*;
import java.util.Scanner;

public class PreparedStatement_login_demo {
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
        PreparedStatement stmt = null;
        ResultSet rs = null;
        try {
            conn = JDBCUtils.getConnection();

            String sql = "select * from user where username = ? and password = ?";          //* 使用问号作为占位符, 账密动态输入

            stmt = conn.prepareStatement(sql);                                              //* conn的成员方法, 返回动态执行对象
            stmt.setString(1, username);                                       //* setXxx(index, value)方法, 根据指定的数据类型选择不同的set
            stmt.setString(2, password);
            rs = stmt.executeQuery();                                                        //

            return rs.next();                       //有数据返回真
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            JDBCUtils.close(rs, stmt, conn);
        }

        return false;
    }
}
