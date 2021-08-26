package com.wei.factory;

import com.wei.dao.UserDao;
import com.wei.dao.impl.UserDaoImpl;

/**
 * @author wei
 * @create 2021-08-26 21:20
 */
public class DynamicFactory {
    public UserDao getUserDao(){
        return new UserDaoImpl();
    }

}
