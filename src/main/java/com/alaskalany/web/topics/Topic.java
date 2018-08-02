package com.alaskalany.web.topics;

/**
 * Topic
 */
public class Topic {

    /**
     * Topic id
     */
    private String id;

    /**
     * Topic name
     */
    private String name;
    /**
     * Topic group
     */
    private String group;

    /**
     * Topic
     */
    @SuppressWarnings("unused")
    public Topic() {

    }

    /**
     * Topic
     *
     * @param name  Topic name
     * @param group Topic group
     */
    Topic(String id, String name, String group) {
        this.id = id;
        this.name = name;
        this.group = group;
    }

    /**
     * Get topic's id
     *
     * @return Topic id
     */
    String getId() {
        return id;
    }

    /**
     * Set topic's id
     *
     * @param id Topic id
     */
    @SuppressWarnings("unused")
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Get topic's name
     *
     * @return Topic name
     */
    @SuppressWarnings("unused")
    public String getName() {
        return name;
    }

    /**
     * Set topic's name
     *
     * @param name Topic name
     */
    @SuppressWarnings("unused")
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Get topic's group
     *
     * @return Topic group
     */
    @SuppressWarnings("unused")
    public String getGroup() {
        return group;
    }

    /**
     * Set topic's group
     *
     * @param group Topic group
     */
    @SuppressWarnings("unused")
    public void setGroup(String group) {
        this.group = group;
    }
}
