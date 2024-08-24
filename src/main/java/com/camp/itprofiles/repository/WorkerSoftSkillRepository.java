package com.camp.itprofiles.repository;


import com.camp.itprofiles.model.WorkerSoftSkill;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WorkerSoftSkillRepository extends JpaRepository<WorkerSoftSkill,Long> {

}
