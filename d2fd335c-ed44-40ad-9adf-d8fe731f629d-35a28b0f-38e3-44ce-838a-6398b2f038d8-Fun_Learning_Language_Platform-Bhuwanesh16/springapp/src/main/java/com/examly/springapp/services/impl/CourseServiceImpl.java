package com.examly.springapp.services.impl;

import com.examly.springapp.entities.Course;
import com.examly.springapp.entities.Language;
import com.examly.springapp.exception.ResourceNotFoundException;
import com.examly.springapp.repositories.CourseRepository;
import com.examly.springapp.services.CourseService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class CourseServiceImpl implements CourseService {

    private final CourseRepository courseRepository;

    public CourseServiceImpl(CourseRepository courseRepository) {
        this.courseRepository = courseRepository;
        }

        @Transactional
        @Override
        public List<Course> getCoursesByLevel(String level) {
            return courseRepository.findCoursesByLevel(level);
            }

            @Override
            public Course createCourse(Course course) {
                return courseRepository.save(course);
                }

                @Override
                public Course updateCourse(Long id, Course courseDetails) {
                    Course course = courseRepository.findById(id)
                    .orElseThrow(() -> new ResourceNotFoundException("Course not found with id: " + id));

                    course.setTitle(courseDetails.getTitle());
                    course.setLevel(courseDetails.getLevel());

                    return courseRepository.save(course);
                    }

                    @Override
                    public boolean deleteCourse(Long id) {
                    Course course = courseRepository.findById(id)
                    .orElseThrow(() -> new ResourceNotFoundException("Course not found with id: " + id));

                    courseRepository.delete(course);
                    return true;
                    }

                    @Override
                    public Course getCourseById(Long id) {
                    return courseRepository.findById(id)
                    .orElseThrow(() -> new ResourceNotFoundException("Course not found with id: " + id));
                    }

                    @Override
                    public Language createLanguage(Language language) {
                        // TODO Auto-generated method stub
                        throw new UnsupportedOperationException("Unimplemented method 'createLanguage'");
                    }

                    @Override
                    public List<Language> getAllLanguages() {
                        // TODO Auto-generated method stub
                        throw new UnsupportedOperationException("Unimplemented method 'getAllLanguages'");
                    }

                    @Override
                    public Language getLanguageById(Long id) {
                        // TODO Auto-generated method stub
                        throw new UnsupportedOperationException("Unimplemented method 'getLanguageById'");
                    }

                    @Override
                    public Language updateLanguage(Long id, Language language) {
                        // TODO Auto-generated method stub
                        throw new UnsupportedOperationException("Unimplemented method 'updateLanguage'");
                    }

                    @Override
                    public void deleteLanguage(Long id) {
                        // TODO Auto-generated method stub
                        throw new UnsupportedOperationException("Unimplemented method 'deleteLanguage'");
                    }
                    }