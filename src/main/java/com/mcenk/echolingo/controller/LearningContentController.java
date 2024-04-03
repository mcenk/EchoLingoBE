package com.mcenk.echolingo.controller;

import com.mcenk.echolingo.model.LearningContent;
import com.mcenk.echolingo.request.LearningContentCreateRequest;
import com.mcenk.echolingo.service.LearningContentService;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/learning-contents")
public class LearningContentController {

    private final LearningContentService learningContentService;

    public LearningContentController(LearningContentService contentService) {
        this.learningContentService = contentService;
    }

    @PostMapping("/create")
    public ResponseEntity<LearningContent> createLearningContent (@Validated @RequestBody LearningContentCreateRequest learningContentCreateRequest){

        return ResponseEntity.ok(learningContentService.createLearningContent(learningContentCreateRequest));
    }



}


