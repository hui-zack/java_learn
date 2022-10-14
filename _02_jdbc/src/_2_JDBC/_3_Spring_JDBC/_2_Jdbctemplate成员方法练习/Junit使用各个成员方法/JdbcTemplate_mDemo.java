package _2_JDBC._3_Spring_JDBC._2_Jdbctemplate成员方法练习.Junit使用各个成员方法;

import org.junit.Test;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import _2_JDBC.utils.DruidUtils;

import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

/**
 * 7条练习
 * */
public class JdbcTemplate_mDemo {
    JdbcTemplate template = new JdbcTemplate(DruidUtils.getDataSource());
    /**
     * 1.bd3.emp中id为1的数据, 修改salary值为10000
     * */
    @Test
    public void test1(){
        String sql = "update emp set salary = ? where id = ?";
        int count = template.update(sql, 20000, 1);                    //*
        System.out.println("emp update lines: %d".formatted(count));
    }

    /**
     * 2.在emp表中添加一条记录
     * */
    @Test
    public void test2(){
        String sql = "insert into emp(id, ename, dept_id) value (?, ?, ?)";
        int count = template.update(sql, 14, "犬夜叉", 10);
        System.out.println(count);
    }

    /**
     * 3.删除emp表中的添加的数据
     * */
    @Test
    public void test3(){
        String sql = "delete from emp where id =?";
        int count = template.update(sql, 14);
        System.out.println("delete line: %s".formatted(count));
    }

    /**
     * 查询id为1的记录, 将其封装为map集合
     * */
    @Test
    public void test4(){
        String sql = "select * from emp where id = ?";

        Map<String, Object> empLineMap = template.queryForMap(sql, 1);
        System.out.println(empLineMap);
    }


    /**
     *  查询emp表的所有记录, 并返回为List<map<String, Object>>:
     * */
    @Test
    public void test5(){
        String sql = "select * from emp ";
        List<Map<String, Object>> lineMaps = template.queryForList(sql);
        for (Map<String, Object> map : lineMaps){
            System.out.println(map);
        }
    }

    /**
     *  查询所有记录, 并将其封装为javaBean对象(Emp对象)
     * */
    @Test
    public void test6(){

        String sql = "select * from emp";
        /*
         * 自动封装
         * query(sql, arg)自动封装javaBean时:
         *    javaBean类的类变量不能为基本数据类型, 因为基本数据类型不能接受null(数据库中存的null), 只能改为包装类.
         * */
        List<Emp> mapList = template.query(sql, new BeanPropertyRowMapper<Emp>(Emp.class));
        for (Emp e: mapList){
            System.out.println(e);
        };

        /*
         * 手动封装
         * */
        List<Emp> maps = template.query(sql, new RowMapper<Emp>() {
            @Override
            public Emp mapRow(ResultSet rs, int i) throws SQLException {

                int id = rs.getInt("id");
                String ename = rs.getString("ename");
                int job_id = rs.getInt("job_id");
                int mgr = rs.getInt("mgr");
                Date joindate = rs.getDate("joindate");
                double salary = rs.getDouble("salary");
                double bonus = rs.getDouble("bonus");
                Integer dept_id = rs.getInt("dept_id");

                Emp emp = new Emp(id, ename, job_id, mgr, joindate, salary, bonus, dept_id);

                return emp;
            }
        });

        for (Emp e: maps){
            System.out.println(e);
        };
    }

    /**
     *  查询总记录数
     * */
    @Test
    public void test7(){
        String sql = "select count(id) from emp";
        Long total = template.queryForObject(sql, Long.class);      //* template.queryForObject(sql, arg); arg为查询结果的类型的class
        System.out.println(total);
    }
}
