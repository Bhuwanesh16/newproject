package com.examly.springapp.repositories;

import com.examly.springapp.entities.Enrollment;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface EnrollmentRepository extends JpaRepository<Enrollment, Long> {
    List<Enrollment>findByUserId(Long userId);
    }