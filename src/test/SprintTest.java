package test;

import com.yrp.ssh.entity.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/** 
* UserDaoImpl Tester. 
* 
* @author <Authors yrp>
* @since <pre>一月 13, 2018</pre> 
* @version 1.0 
*/ 
public class SprintTest {

@Before
public void before() throws Exception { 
} 

@After
public void after() throws Exception { 
} 
@Test
    public void testGetSessionFactory(){
    ApplicationContext context= new ClassPathXmlApplicationContext("applicationContext.xml");
    SessionFactory sessionFactory= (SessionFactory) context.getBean("sessionFactory");
    Session session=sessionFactory.openSession();
    List<Student> students=session.createQuery("from Student").list();
    System.out.println(students);
}

} 
