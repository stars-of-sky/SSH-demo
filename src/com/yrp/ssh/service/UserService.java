package com.yrp.ssh.service;

import com.yrp.ssh.dao.UserDao;
import com.yrp.ssh.entity.Student;

import java.util.List;

/**
 * Create By Administrator.
 * Date:2018/1/13
 */

public class UserService {
    private UserDao userDao;
    public List<Student> findAllStudent(){
//        userDao=new UserDaoImpl();
         return userDao.findAllStudent();
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }
}
