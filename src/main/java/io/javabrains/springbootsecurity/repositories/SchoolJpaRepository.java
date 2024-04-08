package io.javabrains.springbootsecurity.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import io.javabrains.springbootsecurity.models.Principal;

@Repository
public interface SchoolJpaRepository extends JpaRepository<Principal, Integer> {
    
}
