
package com.mycompany.dao;
import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


public class StduentManager
{
    
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
