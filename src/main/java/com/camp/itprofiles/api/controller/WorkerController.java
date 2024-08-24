package com.camp.itprofiles.api.controller;


import com.camp.itprofiles.service.WorkerService;
import com.camp.itprofiles.dto.WorkerProfileDTO;
import io.swagger.v3.oas.annotations.Operation;
import lombok.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/users")
public class WorkerController {

    private final WorkerService workerService;

    @Operation(summary = "Получить всех пользователей")
    @GetMapping
    ResponseEntity<List<WorkerProfileDTO>> getAllWorker(){
        return ResponseEntity.status(HttpStatus.OK)
                .body(workerService.findAll());
    };

    @Operation(summary = "Получить ползователя по id")
    @GetMapping("/{id}")
    ResponseEntity<WorkerProfileDTO> getWorkerById(@PathVariable Long id){
        return ResponseEntity.status(HttpStatus.OK)
                .body(workerService.findById(id));
    };

    @Operation(summary = "Обновить данные пользователя по id")
    @PatchMapping("/{id}")
    ResponseEntity<WorkerProfileDTO> updateWorkerById(@PathVariable Long id, @RequestBody WorkerProfileDTO workerProfileDTO){
        WorkerProfileDTO updatedWorker = workerService.updateUser(id, workerProfileDTO);
        return ResponseEntity.ok(updatedWorker);
    };
}

