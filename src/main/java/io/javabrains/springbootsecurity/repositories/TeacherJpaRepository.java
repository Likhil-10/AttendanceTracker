package io.javabrains.springbootsecurity.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import io.javabrains.springbootsecurity.models.Teacher;

@Repository
public interface TeacherJpaRepository extends JpaRepository<Teacher, Integer> {
 
}
