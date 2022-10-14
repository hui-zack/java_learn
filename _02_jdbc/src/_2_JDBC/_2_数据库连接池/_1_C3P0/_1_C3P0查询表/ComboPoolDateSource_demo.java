package _2_JDBC._2_数据库连接池._1_C3P0._1_C3P0查询表;
//需求: 查询db4.user表的所有数据, 并打印在控制台

import _2_JDBC._2_数据库连接池._2_druid._1_druid查询表.User;
import com.mchange.v2.c3p0.ComboPooledDataSource;
import _2_JDBC.utils.JDBCUtils;
import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ComboPoolDateSource_demo {
    public static void main(String[] args) {
        //1.创建数据库连接池对象
        DataSource ds  = new ComboPooledDataSource();           //* 获取连接池, 选择默认配置
        //2. 获取连接对象
        Connection conn = null;
        PreparedStatement ps = null;
        try {
            conn = ds.getConnection();                          //* 连接池借用连接对象
            String sql = "select * from user";
            ps = conn.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();
            List<User> userList = parseUserResult(rs);
            for (User user : userList){
                System.out.println(user);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            JDBCUtils.close(ps, conn);                          //* jdbc工具类返还连接对象
        }
    }
    /*
    * param @ db4.user表 select结果集对象
    * return @ User对象
    * */
    public static List<User> parseUserResult(ResultSet rs) throws SQLException {
        List<User> userList = new ArrayList<>();
        User user = null;
        while (rs.next()){
            int id = rs.getInt("id");
            String username = rs.getString("username");
            String password = rs.getString("password");
            user = new User(id, username, password);
            userList.add(user);
        }
        return userList;
    }
}


