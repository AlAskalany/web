package com.alaskalany.web.topics;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Topics Controller
 */
@RestController
public class TopicsController {

    /**
     * Topics Service
     */
    private final TopicsService topicsService;

    @Autowired
    public TopicsController(TopicsService topicsService) {
        this.topicsService = topicsService;
    }

    /**
     * Get all topics
     *
     * @return List of topics
     */
    @RequestMapping("/topics")
    public List<Topic> getAllTopics() {

        return topicsService.getAllTopics();
    }

    /**
     * Get a topic
     *
     * @param id Topic id
     * @return Topic
     */
    @RequestMapping("/topics/{id}")
    public Topic getTopic(@PathVariable String id) {
        return topicsService.getTopic(id);
    }

    /**
     * Add a topic
     *
     * @param topic Topic
     */
    @RequestMapping(value = "/topics", method = RequestMethod.POST)
    public void addTopic(@RequestBody Topic topic) {
        topicsService.addTopic(topic);
    }

    /**
     * Update a topic
     *
     * @param topic Topic
     * @param id    Topic id
     */
    @RequestMapping(value = "/topics/{id}", method = RequestMethod.PUT)
    public void updateTopic(@RequestBody Topic topic, @PathVariable String id) {
        topicsService.updateTopic(topic, id);
    }

    /**
     * Delete a topic
     *
     * @param id Topic id
     */
    @RequestMapping(value = "/topics/{id}", method = RequestMethod.DELETE)
    public void deleteTopic(@PathVariable String id) {
        topicsService.deleteTopic(id);
    }
}
