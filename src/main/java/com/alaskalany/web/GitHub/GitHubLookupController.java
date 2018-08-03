package com.alaskalany.web.GitHub;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.CompletableFuture;

@RestController
public class GitHubLookupController {
    private final GitHubLookupService gitHubLookupService;

    @Autowired
    public GitHubLookupController(GitHubLookupService gitHubLookupService) {
        this.gitHubLookupService = gitHubLookupService;
    }

    @RequestMapping("/githubuser/{login}")
    public CompletableFuture<User> getGitHubUser(@PathVariable String login) throws InterruptedException {
        return gitHubLookupService.getGitHubUser(login);
    }
}
