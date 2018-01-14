package com.yrp.ssh.dao.impl;

import com.yrp.ssh.dao.UserDao;
import com.yrp.ssh.entity.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.List;

/**
 * Create By Administrator.
 * Date:2018/1/13
 */

//extends HibernateTemplate
public class UserDaoImpl  implements UserDao {
    private SessionFactory sessionFactory;

    //测试用
    public UserDaoImpl() {
        System.out.println("测试,SpringIOC启动时，对象创建成功");
    }

    @Override
    public List<Student> findAllStudent() {
        String hql = "from Student";
        Session session = sessionFactory.getCurrentSession();
        List<Student> students = session.createQuery(hql).list();
        return students;
    }

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
}
