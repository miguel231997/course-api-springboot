package io.java.springbootstarter.controller;


import io.java.springbootstarter.model.Topic;
import io.java.springbootstarter.service.TopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
        public void addTopic(@RequestBody Topic topic) {
            topicService.addTopic(topic);
        }

    @RequestMapping(method = RequestMethod.PUT, value = "topics/{id}")
    public void updateTopic(@RequestBody Topic topic, @PathVariable String id) {
        topicService.updateTopic(id, topic);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "topics/{id}")
    public void updateTopic(@PathVariable String id) {
        topicService.deleteTopic(id);
    }
}
