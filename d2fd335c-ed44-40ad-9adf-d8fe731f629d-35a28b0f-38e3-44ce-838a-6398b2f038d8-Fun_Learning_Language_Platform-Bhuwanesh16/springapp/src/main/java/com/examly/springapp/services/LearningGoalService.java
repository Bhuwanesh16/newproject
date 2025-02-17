package com.examly.springapp.services;
import com.examly.springapp.entities.LearningGoal;
import com.examly.springapp.exception.ResourceNotFoundException;
import com.examly.springapp.repositories.LearningGoalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LearningGoalService {
    @Autowired
    private LearningGoalRepository learningGoalRepository;

    public LearningGoal createLearningGoal(LearningGoal learningGoal) {
        return learningGoalRepository.save(learningGoal);
        }

        public List<LearningGoal> getAllLearningGoals() {
            return learningGoalRepository.findAll();
            }

            public LearningGoal getLearningGoalById(Long id) {
                return learningGoalRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Learning Goal not found with id: " + id));
                }

                public LearningGoal updateLearningGoal(Long id, LearningGoal goalDetails) {
                    LearningGoal goal = getLearningGoalById(id);
                    goal.setGoalName(goalDetails.getGoalName());
                    goal.setTargetCompletionDate(goalDetails.getTargetCompletionDate());
                    return learningGoalRepository.save(goal);
                    }

                    public void deleteLearningGoal(Long id) {
                    learningGoalRepository.deleteById(id);
                    }
                    }