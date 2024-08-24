package com.camp.itprofiles.repository;

import com.camp.itprofiles.model.CompetencyLevel;
import com.camp.itprofiles.model.SystemLevel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CompetencyLevelRepository extends JpaRepository<CompetencyLevel,Long> {
    CompetencyLevel findCompetencyLevelById(Long id);
}
