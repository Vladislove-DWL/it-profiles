package com.camp.itprofiles.service;

import com.camp.itprofiles.dto.WorkerProfileDTO;
import com.camp.itprofiles.dto.request.LogInRequest;
import com.camp.itprofiles.dto.request.SignUpRequest;
import com.camp.itprofiles.exception.NotFoundException;
import com.camp.itprofiles.mapper.AuthMapper;
import com.camp.itprofiles.mapper.WorkerProfileMapper;
import com.camp.itprofiles.model.Worker;
import com.camp.itprofiles.repository.SystemLevelRepository;
import com.camp.itprofiles.repository.WorkerRepository;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.mindrot.jbcrypt.BCrypt;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
@Transactional
public class WorkerService {

    private final WorkerRepository workerRepository;
    private final SystemLevelRepository systemLevelRepository;


    public Optional<Worker> findOptionalByEmail(String email) {
        return workerRepository.findWorkerByEmail(email);
    }

    public Long createWorker(SignUpRequest signUpRequest) {
        Worker worker = AuthMapper.INSTANCE.toEntity(signUpRequest);
        worker.setPassword(hashPassword(worker.getPassword()));
        worker.setSystemLevel(systemLevelRepository.findSystemLevelById(1L));
        return workerRepository.save(worker).getId();
    }

    public WorkerProfileDTO findById(Long id) {
        return WorkerProfileMapper.INSTANCE.toDTO(workerRepository.findById(id)
                .orElseThrow(() -> new NotFoundException("Пользователя с таким id не существует")));
    }

    public List<WorkerProfileDTO> findAll() {
        return workerRepository.findAll().stream()
                .map(WorkerProfileMapper.INSTANCE::toDTO)
                .toList();
    }

    public WorkerProfileDTO updateUser(Long id, WorkerProfileDTO workerProfileDTO) {
        Worker worker = workerRepository.findById(id)
                .orElseThrow(() -> new NotFoundException("Пользователя с таким id не существует"));

        WorkerProfileMapper.INSTANCE.updateEntity(worker, workerProfileDTO);

        workerRepository.save(worker);

        return WorkerProfileMapper.INSTANCE.toDTO(worker);
    }

    public static String hashPassword(String password) {
        return BCrypt.hashpw(password, BCrypt.gensalt(12));
    }

}
