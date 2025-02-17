package com.examly.springapp.services;

import java.util.List;

import com.examly.springapp.entities.Enrollment;

public interface EnrollmentService {
    List<Enrollment> getEnrollmentByUserId(Long usedId);
Enrollment createEnrollment(Enrollment enrollment);
Enrollment updateEnrollment(Long id, Enrollment enrollment);
Enrollment getEnrollmentById(Long id);
boolean deleteEnrollment(Long id);
List<Enrollment> getEnrollmentsByUserId(Long id);
}