package com.example.attendancetracker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.attendancetracker.models.Principal;

@Repository
public interface SchoolJpaRepository extends JpaRepository<Principal, Integer> {
    
}
