package com.example.attendancetracker.models;

import jakarta.persistence.*;

@Entity
@Table(name = "teacher")
public class Teacher {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int teacherid;

    @Column(name = "name")
    private String name;

    @Column(name = "grade")
    private int grade;

    @Column(name = "age")
    private int age;

    @Column(name = "email")
    private String email;

    @Column(name = "phone")
    private String phone;

    public Teacher(){}

    public Teacher(int teacherid, String name, int grade, int age, String email, String phone) {
        this.teacherid = teacherid;
        this.name = name;
        this.grade=grade;
        this.age=age;
        this.email = email;
        this.phone = phone;
    }

    public int getTeacherId()
    {
        return this.teacherid;
    }
    public void setTeacherId(int teacherid)
    {
        this.teacherid=teacherid;
    }

    public String getName()
    {
        return this.name;
    }
    public void setName(String name)
    {
        this.name=name;
    }

    public int getGrade()
    {
        return this.grade;
    }
    public void setGrade(int grade)
    {
        this.grade=grade;
    }

    public int getAge()
    {
        return this.age;
    }
    public void setAge(int age)
    {
        this.age=age;
    }

    public String getEmail()
    {
        return this.email;
    }
    public void setEmail(String email)
    {
        this.email=email;
    }

    public String getPhone()
    {
        return this.phone;
    }
    public void setPhone(String phone)
    {
        this.phone=phone;
    }
    
}
