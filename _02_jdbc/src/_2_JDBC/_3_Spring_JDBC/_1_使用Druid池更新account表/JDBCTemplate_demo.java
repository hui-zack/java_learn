package _2_JDBC._3_Spring_JDBC._1_使用Druid池更新account表;
// 需求使用Druid更新account表中的数据
/*
    要求: id为三的人, balance修改为5000
*/
import org.springframework.jdbc.core.JdbcTemplate;
import _2_JDBC.utils.DruidUtils;

public class JDBCTemplate_demo {
    public static void main(String[] args) {
        JdbcTemplate template = new JdbcTemplate(DruidUtils.getDataSource());             //*

        String sql = "update account set balance = 5000 where id = ?";

        int count = template.update(sql, 2);                                        //*
        System.out.println("update line: " + count);
    }
}
