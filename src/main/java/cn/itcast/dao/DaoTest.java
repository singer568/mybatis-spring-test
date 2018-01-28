package cn.itcast.dao;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DaoTest {
    private ApplicationContext context=null;
    private  UserDao userDao=null;
    public void test(){
        context=new ClassPathXmlApplicationContext("applicationContext.xml");
        userDao=(UserDao)context.getBean("userDao");
        System.out.println(userDao.getById(1));
    }
    public static void main(String[] args){
        new DaoTest().test();
    }
}
