package com.erpfinanceiro.config;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 *
 * @author Ramon Lodi
 */

@RestControllerAdvice
public class GlobalExceptionHandler {
    
    @ExceptionHandler(RuntimeException.class)
    public ResponseEntity<String> handleAdminException(RuntimeException ex){
        return ResponseEntity
                .badRequest()
                .body(ex.getMessage());
    }
}
