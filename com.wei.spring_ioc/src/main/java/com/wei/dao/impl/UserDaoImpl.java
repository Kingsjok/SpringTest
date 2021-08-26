package com.wei.dao.impl;

import com.wei.dao.UserDao;

/**
 * @author wei
 * @create 2021-08-26 20:39
 */
public class UserDaoImpl implements UserDao {

    public UserDaoImpl() {
        System.out.println("UserDaoImpl创建...");
    }

    public void init(){
        System.out.println("初始化方法...");
    }

    public void destroy(){
        System.out.println("销毁方法...");
    }


    @Override
    public void save() {
        System.out.println("save success...");
    }
}
