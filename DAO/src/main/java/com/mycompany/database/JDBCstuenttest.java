/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.database;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author w208999498
 */
public class JDBCstuenttest {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"ApplicationContextDAO.xml"});
        
       
        JDBCstudent newStudent = (JDBCstudent) context.getBean("sdao");
        int status = newStudent.saveStudent(new Student("John", "Smith", "1/1/2000"));
        
        System.out.println(status);
        
    }
}
