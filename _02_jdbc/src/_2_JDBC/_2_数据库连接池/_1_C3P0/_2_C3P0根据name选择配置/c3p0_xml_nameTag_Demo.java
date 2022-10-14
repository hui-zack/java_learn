package _2_JDBC._2_数据库连接池._1_C3P0._2_C3P0根据name选择配置;
//需求: 根据c3p0配置文件中name为"localhost:3306/db3"的配置运行程序, 查询db3.account表, 不要求打印

import com.mchange.v2.c3p0.ComboPooledDataSource;
import _2_JDBC.utils.JDBCUtils;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class c3p0_xml_nameTag_Demo {
    public static void main(String[] args) {
        //1.创建数据库连接池对象
        DataSource ds  = new ComboPooledDataSource("localhost:3306/db3");           //* 获取连接池, 选择name名为localhost:3306/db3的配置
        //2. 获取连接对象
        Connection conn = null;
        PreparedStatement ps = null;
        try {
            conn = ds.getConnection();                          //* 连接池借用连接对象
            String sql = "select * from account";
            ps = conn.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();

            System.out.println(rs);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            JDBCUtils.close(ps, conn);                          //* jdbc工具类返还连接对象
        }
    }
}
