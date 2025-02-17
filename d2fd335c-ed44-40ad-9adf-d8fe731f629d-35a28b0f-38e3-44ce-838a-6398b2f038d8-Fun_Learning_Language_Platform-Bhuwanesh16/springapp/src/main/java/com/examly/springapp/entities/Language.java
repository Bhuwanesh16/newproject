package com.examly.springapp.entities;

import jakarta.persistence.*;
import lombok.*;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Language {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    @OneToMany(mappedBy = "language", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Course> courses;

    // Explicit Getters and Setters (if needed in some cases where Lombok might not be sufficient)
    public Long getId() {
        return id;
        }

        public void setId(Long id) {
            this.id = id;
            }

            public String getName() {
                return name;
                }

                public void setName(String name) {
                    this.name = name;
                    }

                    public List<Course> getCourses() {
                        return courses;
                        }

                        public void setCourses(List<Course> courses) {
                        this.courses = courses;
                        }
                        }