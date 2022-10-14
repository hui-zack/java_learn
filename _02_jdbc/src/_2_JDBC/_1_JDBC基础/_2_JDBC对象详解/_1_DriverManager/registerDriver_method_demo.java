//需求: 根据lib目录下的jar包, 注册驱动
/*
要求:
    使用-->
        Class.forName("com.mysql.jdbc.Driver")
        DriverManager.registerDriver(new com.mysql.jdbc.Driver())
    分别注册驱动
*/
package _2_JDBC._1_JDBC基础._2_JDBC对象详解._1_DriverManager;
import java.sql.DriverManager;
import java.sql.SQLException;


public class registerDriver_method_demo {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        // 方式1 推荐
        Class.forName("com.mysql.jdbc.Driver");                     //注册驱动

        // 方式2 不推荐
        DriverManager.registerDriver(new com.mysql.jdbc.Driver());  //注册驱动; registerDriver(Driver driver)方法, 参数为jar包中的实现Driver方

    }
}
