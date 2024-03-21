package com.example.attendancetracker.repositories;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.attendancetracker.models.Student;

@Repository
public interface StudentJpaRepository extends JpaRepository<Student, Integer> {
    
    ArrayList<Student> findByGrade(int grade);
}
