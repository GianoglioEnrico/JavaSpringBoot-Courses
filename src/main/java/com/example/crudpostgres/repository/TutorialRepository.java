package com.example.crudpostgres.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

import com.example.crudpostgres.model.Tutorial;

public interface TutorialRepository extends JpaRepository<Tutorial, Long> {
    List<Tutorial> findByPublished(boolean published);

    List<Tutorial> findByTitleContaining(String title);

}