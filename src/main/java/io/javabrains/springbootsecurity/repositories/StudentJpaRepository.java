package io.javabrains.springbootsecurity.repositories;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import io.javabrains.springbootsecurity.models.Student;

@Repository
public interface StudentJpaRepository extends JpaRepository<Student, Integer> {
    
    ArrayList<Student> findByGrade(int grade);
}
