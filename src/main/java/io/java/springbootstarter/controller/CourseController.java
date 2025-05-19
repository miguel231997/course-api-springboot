package io.java.springbootstarter.controller;

import io.java.springbootstarter.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {

    @Autowired
    private CourseService courseService;

    @RequestMapping("/topics/{id}/courses")
    public List<Courses> getAllCourses(@PathVariable String id) {
        return CourseService.getAllCourses(id);
    }
}
