package com.alaskalany.web.GitHub;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class User {

    private String name;
    private String blog;
    private String id;
    private String avatar_url;
    private String gravatar_url;
    private String url;
    private String html_url;
    private String followers_url;
    private String following_url;
    private String gists_url;
    private String starred_url;
    private String subscriptions_url;
    private String organizations_url;
    private String repos_url;
    private String events_url;
    private String received_events_url;
    private String type;
    private String site_admin;
    private String company;
    private String location;
    private String email;
    private String hireable;
    private String bio;
    private String public_repos;
    private String public_gists;
    private String followers;
    private String following;
    private String created_at;
    private String updated_at;

    @SuppressWarnings("unused")
    public String getName() {
        return name;
    }

    @SuppressWarnings("unused")
    public void setName(String name) {
        this.name = name;
    }

    @SuppressWarnings("unused")
    public String getBlog() {
        return blog;
    }

    @SuppressWarnings("unused")
    public void setBlog(String blog) {
        this.blog = blog;
    }

    @SuppressWarnings("unused")
    public String getId() {
        return id;
    }

    @SuppressWarnings("unused")
    public void setId(String id) {
        this.id = id;
    }

    @SuppressWarnings("unused")
    public String getAvatar_url() {
        return avatar_url;
    }

    @SuppressWarnings("unused")
    public void setAvatar_url(String avatar_url) {
        this.avatar_url = avatar_url;
    }

    @SuppressWarnings("unused")
    public String getGravatar_url() {
        return gravatar_url;
    }

    @SuppressWarnings("unused")
    public void setGravatar_url(String gravatar_url) {
        this.gravatar_url = gravatar_url;
    }

    @SuppressWarnings("unused")
    public String getUrl() {
        return url;
    }

    @SuppressWarnings("unused")
    public void setUrl(String url) {
        this.url = url;
    }

    @SuppressWarnings("unused")
    public String getHtml_url() {
        return html_url;
    }

    @SuppressWarnings("unused")
    public void setHtml_url(String html_url) {
        this.html_url = html_url;
    }

    @SuppressWarnings("unused")
    public String getFollowers_url() {
        return followers_url;
    }

    @SuppressWarnings("unused")
    public void setFollowers_url(String followers_url) {
        this.followers_url = followers_url;
    }

    @SuppressWarnings("unused")
    public String getFollowing_url() {
        return following_url;
    }

    @SuppressWarnings("unused")
    public void setFollowing_url(String following_url) {
        this.following_url = following_url;
    }

    @SuppressWarnings("unused")
    public String getGists_url() {
        return gists_url;
    }

    @SuppressWarnings("unused")
    public void setGists_url(String gists_url) {
        this.gists_url = gists_url;
    }

    @SuppressWarnings("unused")
    public String getStarred_url() {
        return starred_url;
    }

    @SuppressWarnings("unused")
    public void setStarred_url(String starred_url) {
        this.starred_url = starred_url;
    }

    @SuppressWarnings("unused")
    public String getSubscriptions_url() {
        return subscriptions_url;
    }

    @SuppressWarnings("unused")
    public void setSubscriptions_url(String subscriptions_url) {
        this.subscriptions_url = subscriptions_url;
    }

    @SuppressWarnings("unused")
    public String getOrganizations_url() {
        return organizations_url;
    }

    @SuppressWarnings("unused")
    public void setOrganizations_url(String organizations_url) {
        this.organizations_url = organizations_url;
    }

    @SuppressWarnings("unused")
    public String getRepos_url() {
        return repos_url;
    }

    @SuppressWarnings("unused")
    public void setRepos_url(String repos_url) {
        this.repos_url = repos_url;
    }

    @SuppressWarnings("unused")
    public String getEvents_url() {
        return events_url;
    }

    @SuppressWarnings("unused")
    public void setEvents_url(String events_url) {
        this.events_url = events_url;
    }

    @SuppressWarnings("unused")
    public String getReceived_events_url() {
        return received_events_url;
    }

    @SuppressWarnings("unused")
    public void setReceived_events_url(String received_events_url) {
        this.received_events_url = received_events_url;
    }

    @SuppressWarnings("unused")
    public String getType() {
        return type;
    }

    @SuppressWarnings("unused")
    public void setType(String type) {
        this.type = type;
    }

    @SuppressWarnings("unused")
    public String getSite_admin() {
        return site_admin;
    }

    @SuppressWarnings("unused")
    public void setSite_admin(String site_admin) {
        this.site_admin = site_admin;
    }

    @SuppressWarnings("unused")
    public String getCompany() {
        return company;
    }

    @SuppressWarnings("unused")
    public void setCompany(String company) {
        this.company = company;
    }

    @SuppressWarnings("unused")
    public String getLocation() {
        return location;
    }

    @SuppressWarnings("unused")
    public void setLocation(String location) {
        this.location = location;
    }

    @SuppressWarnings("unused")
    public String getEmail() {
        return email;
    }

    @SuppressWarnings("unused")
    public void setEmail(String email) {
        this.email = email;
    }

    @SuppressWarnings("unused")
    public String getHireable() {
        return hireable;
    }

    @SuppressWarnings("unused")
    public void setHireable(String hireable) {
        this.hireable = hireable;
    }

    @SuppressWarnings("unused")
    public String getBio() {
        return bio;
    }

    @SuppressWarnings("unused")
    public void setBio(String bio) {
        this.bio = bio;
    }

    @SuppressWarnings("unused")
    public String getPublic_repos() {
        return public_repos;
    }

    @SuppressWarnings("unused")
    public void setPublic_repos(String public_repos) {
        this.public_repos = public_repos;
    }

    @SuppressWarnings("unused")
    public String getPublic_gists() {
        return public_gists;
    }

    @SuppressWarnings("unused")
    public void setPublic_gists(String public_gists) {
        this.public_gists = public_gists;
    }

    @SuppressWarnings("unused")
    public String getFollowers() {
        return followers;
    }

    @SuppressWarnings("unused")
    public void setFollowers(String followers) {
        this.followers = followers;
    }

    @SuppressWarnings("unused")
    public String getFollowing() {
        return following;
    }

    @SuppressWarnings("unused")
    public void setFollowing(String following) {
        this.following = following;
    }

    @SuppressWarnings("unused")
    public String getCreated_at() {
        return created_at;
    }

    @SuppressWarnings("unused")
    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }

    @SuppressWarnings("unused")
    public String getUpdated_at() {
        return updated_at;
    }

    @SuppressWarnings("unused")
    public void setUpdated_at(String updated_at) {
        this.updated_at = updated_at;
    }

    @Override
    public String toString() {
        return "User [name=" + name + ", blog=" + blog + "]";
    }
}
