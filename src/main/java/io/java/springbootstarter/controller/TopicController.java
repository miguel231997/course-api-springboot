package io.java.springbootstarter.controller;


import io.java.springbootstarter.model.Topic;
import io.java.springbootstarter.service.TopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TopicController {

    @Autowired
    private TopicService topicService;

    @RequestMapping("/topics")
    public List<Topic> getAllTopics() {
        return topicService.getAllTopics();
    }

    @RequestMapping("topics/{id}")
    public Topic getTopic(@PathVariable String id) {
        return topicService.getTopic(id);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/topics")
        public void addTopic(Topic topic) {
            topics.add(topic);
        }

    @RequestMapping(method = RequestMethod.PUT, value = "topics/{id}")
    public void updateTopic(@RequestMapping Topic topic, @PathVariable String id) {
        topicService.updateTopic(id, topic);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "topics/{id}")
    public void updateTopic(@RequestMapping Topic topic, @PathVariable String id) {
        topicService.deleteTopic(id, topic);
    }
}
