package service;


import mapper.UserMapper;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import pojo.User;
import util.SqlSessionFactoryUtils;

public class UserService {
    SqlSessionFactory Factory = SqlSessionFactoryUtils.getSqlSessionFactory();

    /**
     * 登录功能
     * @param username
     * @param password
     * @return pojo.User
     */
    public User login(String username, String password){
        //1. 获取sqlSession
        SqlSession sqlSession = Factory.openSession();
        //2. 加载UserMapper进内存
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        //3. 调用查询方法
        User user = mapper.select(username, password);

        //4. 释放资源
        sqlSession.close();

        return user;
    }
    /*
     User selectByUsername(String username);

    @Insert("insert into tb_user values(null,#{username},#{password})")
    void add(User user);

     */

    /**
     * 注册功能
     * @param user
     * @return boolean
     */
    public boolean register(User user){
        SqlSession sqlSession = Factory.openSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        User u = mapper.selectByUsername(user.getUsername());

        if (u == null){
            mapper.add(user);
            sqlSession.commit();
        }

        sqlSession.close();

        return u == null;
    }

    /**
     * 根据用户名查询
     * @param user
     * @return pojo.User
     */
    public User selectByUsername(String  username){
        SqlSession sqlSession = Factory.openSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        User user_result = mapper.selectByUsername(username);
        sqlSession.close();

        return user_result;
    }

}
