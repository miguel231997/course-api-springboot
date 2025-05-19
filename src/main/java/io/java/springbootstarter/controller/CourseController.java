package io.java.springbootstarter.controller;

import io.java.springbootstarter.model.Course;
import io.java.springbootstarter.model.Topic;
import io.java.springbootstarter.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
public class CourseController {

    @Autowired
    private CourseService courseService;

    @RequestMapping("/topics/{id}/courses")
    public List<Course> getAllCourses(@PathVariable String id) {
        return CourseService.getAllCourses(id);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/topic/{topicId}/courses")
    public void addCourse(@RequestBody Course course, @PathVariable String topicId) {
        course.setTopic(new Topic(topicId, "", ""));
        courseService.addCourse(course);
    }
}
