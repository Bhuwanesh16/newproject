package com.examly.springapp.entities;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class LearningGoal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String goalName;
    private LocalDate targetCompletionDate;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
    }