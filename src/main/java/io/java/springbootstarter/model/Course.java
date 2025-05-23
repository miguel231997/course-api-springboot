package io.java.springbootstarter.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import org.hibernate.annotations.ManyToAny;

@Entity
public class Course {

    @Id
    private String id;
    private String name;
    private String description;
    private String topicId;

    @ManyToOne
    private Topic topic;

    public Course() {

    }

    public Course(String id, String name, String description, String topicId) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.topicId = topicId;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setTopicId(String topicId) {
        this.topicId = topicId;
    }

    public String getTopicId() {
        return topicId;
    }
}
