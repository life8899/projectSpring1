
package com.mycompany.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


public class Grade extends Student
{
    @Autowired
    private String subject;
    @Autowired
    private String letterGrade;

    public Grade() 
    {
        
    }

    public Grade(String subject, String letterGrade) {
        this.subject = subject;
        this.letterGrade = letterGrade;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getLetterGrade() {
        return letterGrade;
    }

    public void setLetterGrade(String letterGrade) {
        this.letterGrade = letterGrade;
    }

    @Override
    public String toString() {
        return "Grade{" + "subject=" + subject + ", letterGrade=" + letterGrade + '}';
    }
    
    
    

}
