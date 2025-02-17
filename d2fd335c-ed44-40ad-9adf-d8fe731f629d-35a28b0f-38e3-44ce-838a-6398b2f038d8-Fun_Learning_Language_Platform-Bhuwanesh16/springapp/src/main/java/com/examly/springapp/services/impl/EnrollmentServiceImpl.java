package com.examly.springapp.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.examly.springapp.entities.Enrollment;
import com.examly.springapp.repositories.EnrollmentRepository;
import com.examly.springapp.services.EnrollmentService;

import java.util.List;

@Service
public class EnrollmentServiceImpl implements EnrollmentService {

@Autowired
private EnrollmentRepository enrollmentRepository;

@Override
public List<Enrollment> getEnrollmentByUserId(Long userId) {
    return enrollmentRepository.findByUserId(userId);
    }

@Override
public Enrollment createEnrollment(Enrollment enrollment) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'createEnrollment'");
}

@Override
public Enrollment updateEnrollment(Long id, Enrollment enrollment) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'updateEnrollment'");
}

@Override
public Enrollment getEnrollmentById(Long id) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'getEnrollmentById'");
}

@Override
public boolean deleteEnrollment(Long id) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'deleteEnrollment'");
}

@Override
public List<Enrollment> getEnrollmentsByUserId(Long id) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'getEnrollmentsByUserId'");
}
    }