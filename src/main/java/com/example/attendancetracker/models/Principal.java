package com.example.attendancetracker.models;

import jakarta.persistence.*;

@Entity
@Table(name = "principal")
public class Principal {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "age")
    private int age;

    @Column(name = "principal_since")
    private String principal_since;

    public Principal(){}

    public Principal(String name, int age, String principal_since)
    {
        this.name=name;
        this.age=age;
        this.principal_since=principal_since;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public void setPrincipal_since(String principal_since) {
        this.principal_since = principal_since;
    }
    public String getPrincipal_since() {
        return principal_since;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
}

