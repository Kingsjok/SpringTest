package com.wei.factory;

import com.wei.dao.UserDao;
import com.wei.dao.impl.UserDaoImpl;

/**
 * @author wei
 * @create 2021-08-26 21:15
 */
public class StaticFactory {

    public static UserDao getUserDao(){

        return new UserDaoImpl();

    }

}
