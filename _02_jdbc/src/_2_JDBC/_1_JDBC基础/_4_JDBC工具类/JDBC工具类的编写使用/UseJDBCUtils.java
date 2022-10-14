package _2_JDBC._1_JDBC基础._4_JDBC工具类.JDBC工具类的编写使用;
//需求: 使用JDBCUtils工具类查询db3.emp表的所有数据
import _2_JDBC._1_JDBC基础._3_查询结果封装为对象.Emp;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UseJDBCUtils {
    public static void main(String[] args) {
        UseJDBCUtils uj = new UseJDBCUtils();
        List<Emp> empList = uj.findAll();

        for (Emp line : empList){
            System.out.println(line);
        }

    }

    public List<Emp> findAll(){
        Connection conn = null;
        Statement stmt = null;
        List<Emp> empList = null;
        ResultSet rs = null;
        try {
            conn = JDBCUtils.getConnection();
            stmt = conn.createStatement();
            String sql = "select * from emp";
            rs = stmt.executeQuery(sql);

            empList = new ArrayList<Emp>();
            while (rs.next()) {
                int id = rs.getInt("id");
                String ename = rs.getString("ename");
                int job_id = rs.getInt("job_id");
                int mgr = rs.getInt("mgr");
                Date joindate = rs.getDate("joindate");
                double salary = rs.getDouble("salary");
                double bonus = rs.getDouble("bonus");
                int dept_id = rs.getInt("dept_id");


                Emp emp = new Emp(id, ename, job_id, mgr, joindate, salary, bonus, dept_id);
                //System.out.println(emp);
                empList.add(emp);
            }

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            JDBCUtils.close(rs, stmt, conn);
        }

        return empList;
    }
}
