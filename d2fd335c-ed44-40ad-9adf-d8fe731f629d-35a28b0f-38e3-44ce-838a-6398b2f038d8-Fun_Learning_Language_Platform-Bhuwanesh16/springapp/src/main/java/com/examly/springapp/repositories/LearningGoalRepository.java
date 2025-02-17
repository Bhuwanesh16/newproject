package com.examly.springapp.repositories;


import com.examly.springapp.entities.LearningGoal;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface LearningGoalRepository extends JpaRepository<LearningGoal, Long> {

    }