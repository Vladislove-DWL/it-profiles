package com.camp.itprofiles.repository;

import com.camp.itprofiles.model.WorkerSoftGrade;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WorkerSoftGradeRepository extends JpaRepository<WorkerSoftGrade,Long> {
}
