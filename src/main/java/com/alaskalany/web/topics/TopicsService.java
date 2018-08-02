package com.alaskalany.web.topics;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Topics service
 */
@Service
public class TopicsService {

    /**
     * Topics list
     */
    private List<Topic> topics = new ArrayList<>(Arrays.asList(new Topic("1", "Maths", "STEM"), new Topic("2", "Physics", "STEM")));

    /**
     * @return List of topics
     */
    List<Topic> getAllTopics() {
        return topics;
    }

    /**
     * Get Topic
     *
     * @param id Topic id
     * @return Topic
     */
    Topic getTopic(String id) {
        return topics.stream().filter(topic -> topic.getId().equals(id)).findFirst().get();
    }

    /**
     * @param topic Topic
     */
    void addTopic(Topic topic) {
        topics.add(topic);
    }

    /**
     * Update Topic
     *
     * @param topic Topic
     * @param id    Topic id
     */
    void updateTopic(Topic topic, String id) {
        for (int i = 0, topicsSize = topics.size(); i < topicsSize; i++) {
            Topic t = topics.get(i);
            if (id.equals(t.getId())) {
                topics.set(i, topic);
                return;
            }
        }
    }

    /**
     * Delete Topic
     *
     * @param id Topic id
     */
    void deleteTopic(String id) {
        topics.removeIf(topic -> topic.getId().equals(id));
    }
}
