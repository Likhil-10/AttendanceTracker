package io.javabrains.springbootsecurity.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import io.javabrains.springbootsecurity.models.Grade;

@Repository
public interface GradeJpaRepository extends JpaRepository<Grade, Integer> {
    
}
