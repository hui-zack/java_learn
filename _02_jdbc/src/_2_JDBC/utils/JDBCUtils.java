package _2_JDBC.utils;


import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.sql.*;
import java.util.Properties;

/*
* JDBC的通用工具类
*
* 包含两个静态方法:
*   getConnection()
*   close(重载)
* */
public class JDBCUtils {
    private static String driver;
    private static String url;
    private static String user;
    private static String password;

    /*
    * 静态代码块, 进内存后仅加载一次
    * 功能:根据配置文件jdbc.properties注册驱动
    * */
    //静态代码块只能处理异常而不能抛出
    static {
        try {
            //类加载器获取数据库src以及Resources根目录中的文件路径
            String path = JDBCUtils.class.getClassLoader().getResource("jdbc.properties").getPath();     //* getPath() url路径转为String路径
                // String path = ClassLoader.getSystemClassLoader().getResource("jdbc.properties").getPath();
            //System.out.println(path);

            Properties prop = new Properties();
            FileReader fr = new FileReader(path);
            prop.load(fr);
            fr.close();

            driver = prop.getProperty("driver");
            url = prop.getProperty("url");
            user = prop.getProperty("user");
            password = prop.getProperty("password");

            // 注册驱动
            Class.forName(driver);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    //返回数据连接对象
    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(url, user, password);
    }

    //关闭资源, 重载次数:2
    public static void close(Statement stmt, Connection conn){
        if (stmt != null){
            try {
                stmt.close();
            } catch (SQLException throwables) {
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

    public static void close(ResultSet rs, Statement stmt, Connection conn){
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

        if (conn != null) {
            try {
                conn.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
    }
}
