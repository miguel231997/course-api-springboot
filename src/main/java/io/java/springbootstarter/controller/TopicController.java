package io.java.springbootstarter.controller;


import io.java.springbootstarter.model.Topic;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TopicController {

    @RequestMapping
    public List<Topic> getAllTopics() {

    }
}
