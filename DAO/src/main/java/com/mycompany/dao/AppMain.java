
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
        
//        StudentManager beanStudentManager = (StudentManager) context.getBean("studentManager");
//        
        bean.setLastName("Smith");
        bean.setFirstName("Adam");
//        beanStudentManager.addStudent(bean);
//        
//        bean.setLastName("White");        
//        beanStudentManager.addStudent(bean);
        
         //System.out.println(bean.toString());
        
       
    }
}
