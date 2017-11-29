package com.spring.hibernate.test;

import com.spring.hibernate.entities.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.sql.DataSource;
import java.sql.Date;
import java.sql.SQLException;

/**
 * Created by Administrator on 2017/11/29.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class SimpleTest {

    @Autowired
    SessionFactory sessionFactory;

    @Autowired
    DataSource dataSource;

    @Test
    public void testDatasource() throws SQLException {
        System.out.println(dataSource.getConnection().toString());
    }

    @Test
    public void testSave()
    {
        Session session = sessionFactory.openSession();
        Employee employee = new Employee();
        employee.setEmail("tes");
        employee.setHiredate(new java.util.Date());
        employee.setName("zzh");
        Transaction transaction =  session.beginTransaction();
        session.save(employee);
        transaction.commit();

    }

}
