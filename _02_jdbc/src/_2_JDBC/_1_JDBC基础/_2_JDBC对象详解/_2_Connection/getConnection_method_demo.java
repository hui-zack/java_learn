package _2_JDBC._1_JDBC基础._2_JDBC对象详解._2_Connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class getConnection_method_demo {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");

        //获取获取数据库操作对象
        String url = "jdbc:mysql//localhost:8999/db3";
        url = "jdbc:mysql:///db3";
        Connection conn = DriverManager.getConnection(url, "root", "root");     //获取连接对象

    }
}
