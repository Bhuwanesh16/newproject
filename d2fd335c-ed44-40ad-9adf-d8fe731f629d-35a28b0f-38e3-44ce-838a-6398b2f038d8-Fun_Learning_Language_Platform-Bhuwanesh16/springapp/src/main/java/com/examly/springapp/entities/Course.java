package com.examly.springapp.entities;

import jakarta.persistence.*;
import lombok.*;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String level;

    @ManyToOne
    @JoinColumn(name = "language_id", nullable = false)
    private Language language;

    @OneToMany(mappedBy = "course", cascade = CascadeType.ALL)
    private List<Enrollment> enrollments;

    @Override
    public String toString() {
        return "Course{id=" + id + ", title='" + title + "', level='" + level + "'}";
    }
}