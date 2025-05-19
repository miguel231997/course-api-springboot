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
        return (List<Topic>) topicRepository.findAll();
    }

    public Topic getTopic(String id) {
        return topicRepository.findById(id).orElse(null);
    }

    public void addTopic(Topic topic) {
        topicRepository.save(topic);
    }

    public void updateTopic(String id, Topic topic) {
        topicRepository.save(topic);
    }

    public void deleteTopic(String  id) {
        topicRepository.deleteById(id);
    }
}
