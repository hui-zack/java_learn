package _2_JDBC._1_JDBC基础._4_JDBC工具类.JDBC工具类的编写使用;


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
    * 功能:根据配置文件jdbc.properties注册驱动,
    * */
    //静态代码块只能处理异常而不能抛出
    static {
        try {
            //自动获取数据库配置文件路径, 使用类加载器
            ClassLoader cl = JDBCUtils.class.getClassLoader();                      //* 使用本类的类加载器
            URL resource = cl.getResource("Config/jdbc.properties");          //* 类加载器获取配置文件绝对路径  src的绝对路径拼接上配置文件的相对路径
            //System.out.println("jdbc配置文件的绝对路径: " + resource);
            String path = resource.getPath();                                       //* url路径转为String路径

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
    public static Connection getConnection() throws SQLException {      //抛出异常方便寻找错误位置
        Connection conn = null;
        conn = DriverManager.getConnection(url, user, password);

        return conn;
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

