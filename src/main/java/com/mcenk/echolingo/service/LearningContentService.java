package com.mcenk.echolingo.service;

import com.mcenk.echolingo.model.LearningContent;
import com.mcenk.echolingo.repository.LearningContentRepository;
import com.mcenk.echolingo.request.LearningContentCreateRequest;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class LearningContentService {

    private final LearningContentRepository learningContentRepository;

    public LearningContentService(LearningContentRepository learningContentRepository) {
        this.learningContentRepository = learningContentRepository;
    }


    public LearningContent createLearningContent(LearningContentCreateRequest learningContentCreateRequest) {

        LearningContent learningContent = new LearningContent();

        learningContent.setContent(learningContentCreateRequest.getContent());
        learningContent.setCreationDate(LocalDateTime.now());



        return  learningContentRepository.save(learningContent);




    }
}
