
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
        
        StudentManager beanSMG = (StudentManager) context.getBean("studentManager");
        Student bean = (Student) context.getBean("student");
               
        
        bean.setLastName("Smith");
        bean.setFirstName("Adam");
        beanSMG.addStudent(bean);
        
        bean.setLastName("White");        
        beanSMG.addStudent(bean);
        
         //System.out.println(bean.toString());
        
       
    }
}
