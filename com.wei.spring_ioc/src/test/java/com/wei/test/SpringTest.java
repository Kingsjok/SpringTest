package com.wei.test;

import com.wei.dao.UserDao;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author wei
 * @create 2021-08-26 20:55
 */
public class SpringTest {
    @Test
    public void test1(){
        ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserDao userDao1 = (UserDao) app.getBean("userDao");
 //       UserDao userDao2 = (UserDao) app.getBean("userDao");
        System.out.println(userDao1);
 //       System.out.println(userDao2);
    }
}
