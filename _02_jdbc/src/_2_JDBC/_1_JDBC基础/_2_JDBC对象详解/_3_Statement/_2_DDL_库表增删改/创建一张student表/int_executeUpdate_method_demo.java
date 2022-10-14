package _2_JDBC._1_JDBC基础._2_JDBC对象详解._3_Statement._2_DDL_库表增删改.创建一张student表;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

//需求: 注册jdbc的mysql驱动, 获取连接对象, 获取执行对象, 创建student表
public class int_executeUpdate_method_demo {
    public static void main(String[] args) {
        Connection conn = null;
        Statement stmt = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/db3", "root", "root");
            stmt = conn.createStatement();

            String sql = "create table student (id int, name varchar(20))";
            int count = stmt.executeUpdate(sql);                            // int executeUpdate(String sql)执行DDL(库表增删改)时, 返回值始终为0
            System.out.println(count);

        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        } finally {
            if (stmt != null){
                try {
                    stmt.close();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
            if (conn != null){
                try {
                    conn.close();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
        }
    }
}
