package io.java.springbootstarter.service;

import org.springframework.stereotype.Service;

@Service
public class CourseService {

    public List<Courses> getAllCourses() {
        return courses;
    }
}
