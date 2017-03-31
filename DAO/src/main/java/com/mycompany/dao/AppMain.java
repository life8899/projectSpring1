
package com.mycompany.dao;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class AppMain {
    public static void main(String[] args) {

        
        Student student;
//        AbstractApplicationContext context = 
//                new FileSystemXmlApplicationContext("SpringDao.xml");
        ApplicationContext context =
    	  new ClassPathXmlApplicationContext(new String[] {"SpringConfig.xml"});
        
       
        Student bean = (Student) context.getBean("student");
        Grade bean1 = (Grade) context.getBean("newGrade");
        Address bean2 = (Address) context.getBean("newAddress");
        
        System.out.println(bean.toString());
        System.out.println(bean1.toString());
        System.out.println(bean2.toString());
//        StudentManager beanStudentManager = (StudentManager) context.getBean("studentManager");
//        
//        
//        beanStudentManager.addStudent(bean);
//        
//        bean.setLastName("White");        
//        beanStudentManager.addStudent(bean);
        
         
        
       
    }
}
