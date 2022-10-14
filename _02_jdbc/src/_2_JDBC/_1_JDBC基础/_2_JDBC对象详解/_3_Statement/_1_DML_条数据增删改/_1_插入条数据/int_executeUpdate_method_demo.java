package _2_JDBC._1_JDBC基础._2_JDBC对象详解._3_Statement._1_DML_条数据增删改._1_插入条数据;

import java.sql.*;

//需求: 根据数据库连接对象创建statement执行对象, 并使用其executeUpdate方法插入一条数据
//要求:
//  进行标准的异常处理
public class int_executeUpdate_method_demo {
    public static void main(String[] args) {
        Statement stmt = null;
        Connection conn = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql:///db3", "root", "root");
            stmt = conn.createStatement();

            String sql = "insert into account value (null, '王昭君', 5000)";
            int lineNum = stmt.executeUpdate(sql);
            if (lineNum > 0) {
                System.out.println("执行成功" + "(修改行数:" + lineNum + ")");
            } else {
                System.out.println("执行失败");
            }
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        } finally {                                     // finally中释放资源
            if (stmt != null) {                         // 程序如果在获取statement对象前出错, stmt就是个空指针, 空指针无法释放资源
                try {
                    stmt.close();
                } catch (SQLException throwables) {     // 处理close()的sql异常
                    throwables.printStackTrace();
                }
            }

            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
        }
    }

}
