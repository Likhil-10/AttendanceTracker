package com.example.attendancetracker.models;

import jakarta.persistence.*;

@Entity
@Table(name = "grade")
public class Grade {
    
    
    @Id
    @Column(name = "grade")
    private int grade;

    @OneToOne
    @JoinColumn(name = "teacherid")
    private Teacher teacherid;

    @Column(name = "strength")
    private int strength;

    public Grade(){}

    public Grade(int grade, Teacher teacherid, int strength)
    {
        this.grade=grade;
        this.teacherid=teacherid;
        this.strength=strength;
    }

    public int getGrade()
    {
        return this.grade;
    }
    public void setGrade(int grade)
    {
        this.grade=grade;
    }

    public Teacher getTeacherId()
    {
        return this.teacherid;
    }
    public void setTeacherId(Teacher teacherid)
    {
        this.teacherid=teacherid;
    }

    public int getStrength()
    {
        return this.strength;
    }
    public void setStrength(int strength)
    {
        this.strength=strength;
    }
}
