package _2_JDBC._1_JDBC基础._3_查询结果封装为对象;
//需求: 定义一个方法, 该方法具有使用jdbc查询db3.emp表的所有数据, 返回到为list集合的功能
import java.sql.*;
import java.util.ArrayList;
import java.util.List;


public class Demo {
    public static void main(String[] args) {
        List<Emp> all_emp = new Demo().findALL();
        for (Emp emp : all_emp) {
            System.out.println(emp);
        }

    }
    public List<Emp> findALL() {
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        List<Emp> empList = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql:///db3", "root", "root");
            stmt = conn.createStatement();

            String sql = "select * from emp";

            rs = stmt.executeQuery(sql);

            //查询结果获取和封装
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

//            for (_3_查询结果封装对象.Emp emp1 : emp_list) {
//                System.out.println(emp1);
//            }
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        } finally {
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
            if (stmt != null) {
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

        return empList;
    }

}
