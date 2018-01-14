package com.yrp.ssh.action;

import com.opensymphony.xwork2.ModelDriven;
import com.yrp.ssh.entity.Student;
import com.yrp.ssh.service.UserService;
import org.apache.struts2.ServletActionContext;

import java.util.List;

/**
 * Create By Administrator.
 * Date:2018/1/13
 */

public class StudentAction implements ModelDriven<Student> {
    private UserService userService;
    //单列模式
    private Student student = new Student();

    public String students() {

        List<Student> students = userService.findAllStudent();

        ServletActionContext.getRequest().setAttribute("students", students);

        return "tostudents";
    }

    @Override
    public Student getModel() {
        return student;
    }

    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    public void setStudent(Student student) {
        this.student = student;
    }
}
