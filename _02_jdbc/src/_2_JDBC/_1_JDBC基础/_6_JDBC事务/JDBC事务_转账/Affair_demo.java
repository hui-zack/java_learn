package _2_JDBC._1_JDBC基础._6_JDBC事务.JDBC事务_转账;

import _2_JDBC.utils.JDBCUtils;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

//需求: 使用jdbc完成事务管理-db3.account zhangsan, lisi转账

public class Affair_demo {
    public static void main(String[] args) {
        Connection conn = null;
        PreparedStatement ps1 = null;
        PreparedStatement ps2 = null;
        try {
            conn = JDBCUtils.getConnection();

            conn.setAutoCommit(false);                                              //* 开启事务

            String sql1 = "update account set balance = balance - ? where id = ?";
            String sql2 = "update account set balance = balance + ? where id = ?";
            int money = 500;
            ps1 = conn.prepareStatement(sql1);
            ps1.setInt(1, 500);
            ps1.setInt(2, 1);

            ps2 = conn.prepareStatement(sql2);
            ps2.setInt(1, 500);
            ps2.setInt(2, 2);
            int ps1_status = ps1.executeUpdate();
            int i = 4/0;
            int ps2_status = ps2.executeUpdate();

            conn.commit();                                                          //* 提交事务

        } catch (SQLException throwables) {
            if (conn != null){
                try {
                    conn.rollback();                                                //* 事务回滚,
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            throwables.printStackTrace();
        } finally {
            JDBCUtils.close(ps1, conn);
            JDBCUtils.close(ps2, null);
        }
    }
}
