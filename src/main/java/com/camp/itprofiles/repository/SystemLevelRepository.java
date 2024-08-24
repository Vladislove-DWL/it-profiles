package com.camp.itprofiles.repository;

import com.camp.itprofiles.model.SystemLevel;
import com.camp.itprofiles.model.Worker;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface SystemLevelRepository extends JpaRepository<SystemLevel,Long> {
    SystemLevel findSystemLevelById(Long id);
}
