package _2_JDBC._2_数据库连接池._2_druid._2_druid工具类;

import _2_JDBC._2_数据库连接池._2_druid._1_druid查询表.DruidDateSourceFactory_CDemo;
import _2_JDBC._2_数据库连接池._2_druid._1_druid查询表.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class UseDruidUtils_demo {
    public static void main(String[] args) {
        Connection conn = null;
        PreparedStatement ps = null;
        try {
            conn = DruidUtils.getConnection();              //* 获取连接对象

            String sql = "select * from user";
            ps = conn.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();
            List<User> userList = DruidDateSourceFactory_CDemo.parseUserResult(rs);

            for (User user : userList){
                System.out.println(user);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            DruidUtils.close(ps, conn);
        }
    }
}


