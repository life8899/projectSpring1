
package com.mycompany.dao;
import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class StduentManager
{
    @Autowired
    Student student;
    
    public void addStudent(Student student)
    {
        System.out.println(student);
    } 
    
    @Override
    public String toString() 
    {
	return "Student [student=" + student + "]";
    }
    
}
