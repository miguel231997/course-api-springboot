package io.java.springbootstarter.service;

import io.java.springbootstarter.Repository.CourseRepository;
import io.java.springbootstarter.model.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Service
public class CourseService {

    @Autowired
    CourseRepository courseRepository;

    public List<Course> getAllCourses(String topicId) {
        Iterable<Course> allCourses = courseRepository.findAll();
        return StreamSupport.stream(allCourses.spliterator(), false)
                .filter(course -> course.getTopic().getId().equals(topicId))
                .collect(Collectors.toList());
    }

    public void addCourse(Course course) {
        courseRepository.save(course);
    }
}
