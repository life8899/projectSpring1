/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.database;

import org.springframework.jdbc.core.JdbcTemplate;

/**
 *
 * @author w208999498
 */
public class JDBCstudent {
    
    private JdbcTemplate jdbcTemplate;
    
    public void setJdbcTemplate(JdbcTemplate jdbcTemplate)
    {
        this.jdbcTemplate = jdbcTemplate;
    }
    
    public int saveStudent(Student s)
    {
        String query ="insert into student values('"+s.getFirstName()+"', '"+s.getLastName()+"', '"+s.getDateOfBirth()+"')";
        
        return jdbcTemplate.update(query);
    }
    
    public int updateStudent(Student s)
    {
        String query = "update student set firstnme='"+s.getFirstName()+"', lastname='"+s.getLastName()+"', DOB='"+s.getDateOfBirth()+"' ";
        return jdbcTemplate.update(query);
    }
    
    public int deleteStudent(Student s)
    {
        String query = "delete from student where id='"+s.getLastName()+"'";
        return jdbcTemplate.update(query);
    }
}
