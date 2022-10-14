package _2_JDBC._1_JDBC基础._2_JDBC对象详解._3_Statement._3_DQL_数据查询;

import java.sql.*;

public class ResultSet_executeQuery_metion_demo {
    public static void main(String[] args) {
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/db3", "root", "root");
            stmt = conn.createStatement();

            String sql = "select * from account";
            rs = stmt.executeQuery(sql);                                                           //* ResultSet executeQuery(String sql)方法, Statement的成员方法, 用来执行DQL数据查询语句

            int id;
            String name;
            double balance;
            while (rs.next()) {                                                                    //* boolean next()方法, ResultSet类的成员方法, 用来条数据的换行, 有数据为true, 无数据false
                id = rs.getInt(1);                                                      //* int getInt(int col)方法, ResultSet类的成员方法, 用来选择数据的列数
                name = rs.getString("name");                                            //* int getInt(String colName)方法, ResultSet类的成员方法, 用来选择数据的列数
                balance = rs.getDouble("balance");
                System.out.println("| %4d | %8s | %4.1f |".formatted(id, name, balance));
            }
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        } finally {
            if (rs != null){
                try {
                    rs.close();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
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
