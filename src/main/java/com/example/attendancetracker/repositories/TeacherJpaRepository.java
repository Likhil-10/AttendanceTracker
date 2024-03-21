package com.example.attendancetracker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.attendancetracker.models.Teacher;

@Repository
public interface TeacherJpaRepository extends JpaRepository<Teacher, Integer> {
 
}
