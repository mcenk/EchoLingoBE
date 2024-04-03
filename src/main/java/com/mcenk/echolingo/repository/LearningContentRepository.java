package com.mcenk.echolingo.repository;

import com.mcenk.echolingo.model.LearningContent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface LearningContentRepository extends JpaRepository<LearningContent, Long> {


}
