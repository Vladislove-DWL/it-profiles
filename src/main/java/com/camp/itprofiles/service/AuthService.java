package com.camp.itprofiles.service;

import com.camp.itprofiles.dto.request.LogInRequest;
import com.camp.itprofiles.dto.request.SignUpRequest;
import com.camp.itprofiles.dto.response.AccessResponse;
import com.camp.itprofiles.exception.AccessException;
import com.camp.itprofiles.exception.AlreadyExistException;
import com.camp.itprofiles.model.Worker;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.mindrot.jbcrypt.BCrypt;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
@Transactional
public class AuthService {

    private final WorkerService workerService;

    public AccessResponse signUp(SignUpRequest request) {
        workerService.findOptionalByEmail(request.email())
                .ifPresent(user -> {throw new AlreadyExistException("Пользователь с таким email уже существует");
                });

        return new AccessResponse(workerService.createWorker(request));
    }

    public AccessResponse signIn(LogInRequest request) {
        Worker worker = workerService.findOptionalByEmail(request.email()).orElseThrow(
                () -> new AccessException("Неверный email или пароль")
        );
        if (verifyPassword(request.password(),worker.getPassword())){
            return new AccessResponse(worker.getId());
        } else {
            throw new AccessException("Неверный email или пароль");
        }

    }

    public static boolean verifyPassword(String password, String hashedPassword) {
        return BCrypt.checkpw(password, hashedPassword);
    }
}
