package com.camp.itprofiles.repository;

import com.camp.itprofiles.model.Competency;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CompetencyRepository extends JpaRepository<Competency,Long> {

    @Query("""
            select c
            from Competency c
            join c.category ca
            where :isHard is null or c.isHard = :isHard
            """)
    List<Competency> findAllCategoriesByFlag(Boolean isHard);
}
