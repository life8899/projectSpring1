
package com.mycompany.dao;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class AppMain {
    public static void main(String[] args) {

//        AbstractApplicationContext context = 
//                new FileSystemXmlApplicationContext("SpringDao.xml");
        ApplicationContext context =
    	  new ClassPathXmlApplicationContext(new String[] {"SpringConfig.xml"});
        

        Student bean = (Student) context.getBean("person");
        
        System.out.println(bean);
        
       
    }
}
