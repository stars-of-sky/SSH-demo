package com.yrp.ssh.dao;

import com.yrp.ssh.entity.Student;

import java.util.List;

public interface UserDao {
    public List<Student> findAllStudent();
}
