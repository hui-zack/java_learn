package _2_JDBC._1_JDBC基础._2_JDBC对象详解._3_Statement._1_DML_条数据增删改._3_删除条数据;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

//需求: 注册jdbc的mysql驱动, 获取连接对象, 获取执行对象, 进行条数据删除操作
public class int_executeUpdate_method_demo {
    public static void main(String[] args) {
        Connection conn = null;
        Statement stmt = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql:///db3", "root", "root");
            stmt = conn.createStatement();

            String sql = "delete from account where id = 3";
            int lineNum = stmt.executeUpdate(sql);
            if (lineNum > 0) {
                System.out.println("删除成功");
            } else {
                System.out.println("删除失败");
            }
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        } finally {
            if (stmt != null) {
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
