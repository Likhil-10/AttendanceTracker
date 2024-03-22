package com.example.attendancetracker.models;

//import java.util.ArrayList;

import jakarta.persistence.*;

@Entity
@Table(name = "student")
public class Student {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "age")
    private int age;

    @Column(name = "class")
    private int grade;

    @ManyToOne
    @JoinColumn(name = "gradedetails")
    private Grade gradedetails;

    public Grade getGradedetails() {
        return gradedetails;
    }

    public void setGradedetails(Grade gradedetails) {
        this.gradedetails = gradedetails;
    }
    // @Transient
    // private ArrayList<AttendanceRecord> attendanceBook=new ArrayList<>();

    public Student(){}

    public Student(int id, String name, int age, int grade, Grade gradedetails) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.grade=grade;
        this.gradedetails=gradedetails;
        // this.attendanceBook= new ArrayList<AttendanceRecord>();
    }

    public int getId()
    {
        return this.id;
    }
    public void setId(int id)
    {
        this.id=id;
    }

    public String getName()
    {
        return this.name;
    }
    public void setName(String name)
    {
        this.name=name;
    }

    public int getAge()
    {
        return this.age;
    }
    public void setAge(int age)
    {
        this.age=age;
    }

    public int getGrade()
    {
        return this.grade;
    }
    public void setGrade(int grade)
    {
        this.grade=grade;
    }

    // public ArrayList<AttendanceRecord> getAttendanceRecord()
    // {
    //     return this.attendanceBook;
    // }
    // public void setAttendanceRecord(AttendanceRecord record)
    // {
    //     this.attendanceBook.add(record);
    // }

}
