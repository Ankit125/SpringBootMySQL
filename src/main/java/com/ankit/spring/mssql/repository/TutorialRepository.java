package com.ankit.spring.mssql.repository;

import com.ankit.spring.mssql.model.Tutorial;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface TutorialRepository extends JpaRepository<Tutorial,Long> {
    List<Tutorial> findByPublished(boolean published);
    List<Tutorial> findByTitleContaining(String title);

    @Query(value = "select * from Tutorial",nativeQuery = true)
    List<Tutorial> findByQuery();
}
