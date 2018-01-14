package test;

import com.yrp.ssh.entity.Student;
import com.yrp.ssh.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * Create By yrp.
 * Date:2018/1/14
 */

public class UserServiceTest {
   @Test
    public void userServciceTest(){
       ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
       UserService userService= (UserService) context.getBean("userService");
       List<Student> students=userService.findAllStudent();
       for (Student student : students) {
           System.out.println(student);
       }
   }
}
