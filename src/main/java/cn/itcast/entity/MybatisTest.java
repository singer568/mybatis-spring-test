package cn.itcast.entity;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.Reader;

public class MybatisTest {
    SqlSessionFactory sessionFactory=null;
    SqlSession sqlSession=null;
    {
        String resource="mybatisConfig.xml";
        Reader reader=null;
        try{
            reader= Resources.getResourceAsReader(resource);
        }catch (Exception e){
            e.printStackTrace();
        }
        sessionFactory=new SqlSessionFactoryBuilder().build(reader);
        sqlSession=sessionFactory.openSession(true);
    }

    // xml
    public void testSelectUser(){
        String statement="cn.itcast.dao.UserDao"+".getById";
        User user=sqlSession.selectOne(statement,1);
        System.out.println(user);
    }

    //接口注解方式
       public void test(){
          IUserMapper userMapper=sqlSession.getMapper(IUserMapper.class);
            User user=userMapper.getById(1);
            System.out.println(user);
        }

    public static void main(String[] args){
        new  MybatisTest().testSelectUser();
    }
}
