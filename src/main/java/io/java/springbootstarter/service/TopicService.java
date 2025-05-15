package io.java.springbootstarter.service;


import io.java.springbootstarter.model.Topic;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TopicService {

    //returning topics list
    public List<Topic> getAllTopics() {
        return topics;
    }
}
