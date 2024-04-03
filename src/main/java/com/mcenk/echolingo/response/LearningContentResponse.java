package com.mcenk.echolingo.response;

import java.time.LocalDate;

public class LearningContentResponse {
    private Long id;
    private String content;
    private LocalDate creationDate;
    private LocalDate nextReviewDate;

    // No-arg constructor
    public LearningContentResponse() {
    }

    // All-args constructor
    public LearningContentResponse(Long id, String content, LocalDate creationDate, LocalDate nextReviewDate) {
        this.id = id;
        this.content = content;
        this.creationDate = creationDate;
        this.nextReviewDate = nextReviewDate;
    }

    // Getter ve setter metodları
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public LocalDate getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(LocalDate creationDate) {
        this.creationDate = creationDate;
    }

    public LocalDate getNextReviewDate() {
        return nextReviewDate;
    }

    public void setNextReviewDate(LocalDate nextReviewDate) {
        this.nextReviewDate = nextReviewDate;
    }
}

