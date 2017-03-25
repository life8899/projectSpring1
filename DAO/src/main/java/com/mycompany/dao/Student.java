
package com.mycompany.dao;

import org.springframework.stereotype.Component;


public class Student 
{
    private String firstName; 
    private String lastName; 
    private String dateOfBirth;
    private Grade newGrade;
    private Address newAddress;

    public Student() {
    }

    public Student(String firstName, String lastName, String dateOfBirth) 
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Grade getNewGrade() {
        return newGrade;
    }

    public void setNewGrade(Grade newGrade) {
        this.newGrade = newGrade;
    }

    public Address getNewAddress() {
        return newAddress;
    }

    public void setNewAddress(Address newAddress) {
        this.newAddress = newAddress;
    }
    
    
    
    
    @Override
    public String toString() {
        return "Student{" + "firstName=" + firstName + ", lastName=" + lastName + ", dateOfBirth=" + dateOfBirth + '}';
        //return this.name + " " + this.age;
    }
    
    
    
    
    
}
