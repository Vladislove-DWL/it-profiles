package com.camp.itprofiles.exception;


import io.swagger.v3.oas.annotations.Hidden;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
@Slf4j
public class ExceptionController {

    @ExceptionHandler(value = {
            NotFoundException.class
    })
    @ResponseStatus(value = HttpStatus.NOT_FOUND)
    @Hidden
    public ResponseEntity<ErrorMessage> resourceNotFoundException(RuntimeException exception) {
        log.error("resourceNotFoundException: {}", exception.getMessage());
        return ResponseEntity.status(HttpStatus.NOT_FOUND)
                .body(ErrorMessage.builder()
                        .statusCode(HttpStatus.NOT_FOUND.value())
                        .description(exception.getMessage())
                        .build());
    }

    @ExceptionHandler(value = {
            AlreadyExistException.class,
    })
    @ResponseStatus(value = HttpStatus.BAD_REQUEST)
    @Hidden
    public ResponseEntity<ErrorMessage> validationException(RuntimeException exception) {
        log.error("validationException: {}", exception.getMessage());
        return ResponseEntity.status(HttpStatus.BAD_REQUEST)
                .body(ErrorMessage.builder()
                        .statusCode(HttpStatus.BAD_REQUEST.value())
                        .description(exception.getMessage())
                        .build());
    }

    @ExceptionHandler(value = {
            AccessException.class,
    })
    @ResponseStatus(value = HttpStatus.UNAUTHORIZED)
    @Hidden
    public ResponseEntity<ErrorMessage> unauthorizedException(RuntimeException exception) {
        log.error("validationException: {}", exception.getMessage());
        return ResponseEntity.status(HttpStatus.UNAUTHORIZED)
                .body(ErrorMessage.builder()
                        .statusCode(HttpStatus.UNAUTHORIZED.value())
                        .description(exception.getMessage())
                        .build());
    }
}
