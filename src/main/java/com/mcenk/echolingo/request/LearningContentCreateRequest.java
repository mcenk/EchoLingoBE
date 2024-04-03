package com.mcenk.echolingo.request;

public class LearningContentCreateRequest {
    private String content;

    // No-arg constructor
    public LearningContentCreateRequest() {
    }

    // All-args constructor
    public LearningContentCreateRequest(String content) {
        this.content = content;
    }

    // Getter ve setter metodları
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
