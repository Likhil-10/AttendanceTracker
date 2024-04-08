package io.javabrains.springbootsecurity.models;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.*;

@Entity
@Table(name = "parent")
public class Parent {
    
    @Id
    @Column(name = "parentid")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int parentId;

    @Column(name = "fathername")
    private String FatherName;

    @Column(name = "fatherage")
    private int FatherAge;

    @Column(name = "mothername")
    private String MotherName;

    @Column(name = "motherage")
    private int MotherAge;

    @OneToMany(mappedBy = "parent")
    @JsonIgnoreProperties("parent")
    private List<Student> student= new ArrayList<>();


    private String email;
    private String phone;    

    public Parent(){}

    public Parent(int parentId, String FatherName, int FatherAge, String MotherName, int MotherAge, String email, String phone){
        this.parentId=parentId;
        this.FatherName=FatherName;
        this.FatherAge=FatherAge;
        this.MotherName=MotherName;
        this.MotherAge=MotherAge;
        this.email=email;
        this.phone=phone;
    }

    public int getParentId() {
        return parentId;
    }
    public void setParentId(int parentId) {
        this.parentId = parentId;
    }

    public String getFatherName() {
        return FatherName;
    }
    public void setFatherName(String fatherName) {
        FatherName = fatherName;
    }

    public int getFatherAge() {
        return FatherAge;
    }
    public void setFatherAge(int fatherAge) {
        FatherAge = fatherAge;
    }

    public String getMotherName() {
        return MotherName;
    }
    public void setMotherName(String motherName) {
        MotherName = motherName;
    }

    public int getMotherAge() {
        return MotherAge;
    }
    public void setMotherAge(int motherAge) {
        MotherAge = motherAge;
    }

    public List<Student> getStudents() {
        return student;
    }
    public void setStudents(List<Student> student) {
        this.student = student;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
}
