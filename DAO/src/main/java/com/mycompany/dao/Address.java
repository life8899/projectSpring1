
package com.mycompany.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


public class Address extends Student
{
    @Autowired
    private String street;
    @Autowired    
    private String zip;
    @Autowired
    private String city;

    public Address() 
    {
    }

    public Address(String street, String zip, String city) 
    {
        this.street = street;
        this.zip = zip;
        this.city = city;
    }

    public String getStreet()
    {
        return street;
    }

    public void setStreet(String street) 
    {
        this.street = street;
    }

    public String getZip() 
    {
        return zip;
    }

    public void setZip(String zip) 
    {
        this.zip = zip;
    }

    public String getCity() 
    {
        return city;
    }

    public void setCity(String city) 
    {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Address{" + "street=" + street + ", zip=" + zip + ", city=" + city + '}';
    }
    
    
}
