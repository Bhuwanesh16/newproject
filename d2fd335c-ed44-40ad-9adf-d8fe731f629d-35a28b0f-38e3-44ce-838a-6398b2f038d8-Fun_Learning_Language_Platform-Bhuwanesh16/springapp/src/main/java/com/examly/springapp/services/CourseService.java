package com.examly.springapp.services;

import java.util.List;

import com.examly.springapp.entities.Course;
import com.examly.springapp.entities.Language;

public interface CourseService {
    // Language methods
    Language createLanguage(Language language);
    List<Language> getAllLanguages();
    Language getLanguageById(Long id);
    Language updateLanguage(Long id, Language language);
    void deleteLanguage(Long id);

    // Course methods
    List<Course> getCoursesByLevel(String level);
    Course createCourse(Course course);
    Course updateCourse(Long id, Course course);
    boolean deleteCourse(Long id);
    Course getCourseById(Long id);
    }