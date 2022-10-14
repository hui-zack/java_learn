package _2_JDBC._2_数据库连接池._2_druid._1_druid查询表;

import com.alibaba.druid.pool.DruidDataSourceFactory;
import _2_JDBC.utils.JDBCUtils;

import javax.sql.DataSource;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class DruidDateSourceFactory_CDemo {
    public static void main(String[] args) throws Exception {
        //* 获取properties
        Properties pro = new Properties();
        InputStream is = DruidDateSourceFactory_CDemo.class.getClassLoader().getResourceAsStream("druid.properties");
        pro.load(is);

        //* 获取连接池对象
        DataSource ds = DruidDataSourceFactory.createDataSource(pro);

        //* 获取数据库连接对象
        Connection conn = ds.getConnection();
        String sql = "select * from user";
        PreparedStatement ps = conn.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        List<User> userList = parseUserResult(rs);
        for (User user : userList){
            System.out.println(user);
        }

        JDBCUtils.close(ps, conn);
    }

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
