package com.example.attendancetracker.models;

public class Parent {
    
    private int parentId;
    private String name;
    private String email;
    private String phoneNumber;

    public Parent(int parentId, String name, String email, String phoneNumber) {
        this.parentId = parentId;
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public int getParentId()
    {
        return this.parentId;
    }
    public void setParentId(int parentId)
    {
        this.parentId=parentId;
    }

    public String getName()
    {
        return this.name;
    }
    public void setName(String name)
    {
        this.name=name;
    }

    public String getEmail()
    {
        return this.email;
    }
    public void setEmail(String email)
    {
        this.email=email;
    }

    public String getPhoneNumber()
    {
        return this.phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber)
    {
        this.phoneNumber=phoneNumber;
    }
}
