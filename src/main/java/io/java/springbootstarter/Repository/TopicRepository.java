package io.java.springbootstarter.Repository;

import io.java.springbootstarter.model.Topic;
import org.springframework.data.repository.CrudRepository;

public interface TopicRepository extends CrudRepository<Topic, String> {

}
