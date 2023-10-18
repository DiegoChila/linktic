package com.linktic.testlinktic.web.controllers;

import com.linktic.testlinktic.domain.dto.ErrorResponseDto;
import com.linktic.testlinktic.domain.exceptions.CustomHttpException;
import org.springframework.context.support.DefaultMessageSourceResolvable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.List;

@RestControllerAdvice
public class AdviceController {

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<ErrorResponseDto> handleValidationException(MethodArgumentNotValidException ex) {
        List<String> errors = ex.getBindingResult().getFieldErrors().stream()
                .map(DefaultMessageSourceResolvable::getDefaultMessage)
                .toList();

        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(new ErrorResponseDto(errors));
    }

    @ExceptionHandler(CustomHttpException.class)
    public ResponseEntity<ErrorResponseDto> handleCustomHttpException(CustomHttpException ex) {
        ErrorResponseDto errorResponseDto = new ErrorResponseDto(List.of(ex.getMessage()));
        return new ResponseEntity<>(errorResponseDto, ex.getHttpStatus());
    }
}
