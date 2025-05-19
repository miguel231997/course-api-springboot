package io.java.springbootstarter.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {

    @RequestMapping("/topics/{id}/courses")
    public List<Courses> getAllCourses(@PathVariable String id) {
        return CourseService.getAllCourses(id);
    }
}
