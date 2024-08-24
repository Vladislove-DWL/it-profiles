package com.camp.itprofiles.repository;

import com.camp.itprofiles.model.Worker;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface WorkerRepository extends JpaRepository<Worker,Long> {
    Optional<Worker> findWorkerByEmail(String email);
}
