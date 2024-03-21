package com.example.attendancetracker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.attendancetracker.models.Grade;

@Repository
public interface GradeJpaRepository extends JpaRepository<Grade, Integer> {
    
}
