package io.java.springbootstarter.service;

import io.java.springbootstarter.Repository.CourseRepository;
import io.java.springbootstarter.model.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {

    @Autowired
    CourseRepository courseRepository;

    public List<Course> getAllCourses(String topicId) {
        return courseRepository.findAll()
                .stream()
                .filter(course -> course.getTopic().getId().equals(topicId))
                .toList();
    }

    public void addCourse(Course course) {
        courseRepository.save(course);
    }
}
