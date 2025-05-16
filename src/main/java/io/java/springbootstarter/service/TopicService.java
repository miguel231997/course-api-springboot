package io.java.springbootstarter.service;


import io.java.springbootstarter.Repository.TopicRepository;
import io.java.springbootstarter.model.Topic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TopicService {

    @Autowired
    private TopicRepository topicRepository;

    //returning topics list
    public List<Topic> getAllTopics() {
        return topics;
    }
}
