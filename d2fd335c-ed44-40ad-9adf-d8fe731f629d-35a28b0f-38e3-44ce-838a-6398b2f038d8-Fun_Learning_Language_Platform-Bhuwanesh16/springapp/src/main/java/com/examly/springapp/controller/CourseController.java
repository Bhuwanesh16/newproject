package com.examly.springapp.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.examly.springapp.entities.Course;
import com.examly.springapp.services.CourseService;

@RestController
@RequestMapping("/api/courses")
public class CourseController {

    private final CourseService courseService;

    public CourseController(CourseService courseService) {
        this.courseService = courseService;
        }

        @GetMapping("/level/{level}")
        public List<Course> getCoursesByLevel(@PathVariable String level) {
            return courseService.getCoursesByLevel(level);
            }

            @PutMapping("/{id}")
            public ResponseEntity<Course> updateCourse(@PathVariable Long id, @RequestBody Course courseDetails) {
                Course updatedCourse = courseService.updateCourse(id, courseDetails);
                return ResponseEntity.ok(updatedCourse);
                }
                }