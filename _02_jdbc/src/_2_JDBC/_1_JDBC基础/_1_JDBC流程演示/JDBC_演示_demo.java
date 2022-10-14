//需求: 使用DriverManager类
//      (1)注册mysql驱动
//      (2)获取mysql连接对象
package _2_JDBC._1_JDBC基础._1_JDBC流程演示;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class JDBC_演示_demo {
    public static void main(String[] args) throws Exception {
        //注册JDBC驱动
        Class.forName("com.mysql.jdbc.Driver");

        //获取获取数据库操作对象
        String url = "jdbc:mysql//localhost:8999/db3";
        url = "jdbc:mysql:///db3";
        Connection conn = DriverManager.getConnection(url, "root", "root");
        Statement stmt = conn.createStatement();

        //执行sql语句
        String sql_command = "update account set balance = 200 where id = 1";
        int result = stmt.executeUpdate(sql_command);
        System.out.println(result);

        conn.close();
        stmt.close();
    }
}
