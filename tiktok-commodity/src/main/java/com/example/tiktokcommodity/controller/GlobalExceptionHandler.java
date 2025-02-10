package com.example.tiktokcommodity.controller;

import com.example.tiktokcommodity.Result.Result;
import jakarta.validation.ValidationException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.List;

@Slf4j
@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(value = ValidationException.class)
    public Result handleValidationException(ValidationException ex) {
        return Result.error(ex.getMessage());
    }

    @ExceptionHandler(value = DataIntegrityViolationException.class)
    public Result handleDataIntegrityViolationException(DataIntegrityViolationException ex) {
        return Result.error("数据完整性异常");
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public Result handleValidationExceptions(MethodArgumentNotValidException ex) {
        BindingResult result = ex.getBindingResult();
        List<FieldError> allErrors = result.getFieldErrors();
        return Result.error(allErrors.get(0).getDefaultMessage());
    }

    //全局异常处理
    @ExceptionHandler(Throwable.class)
    public Result unhandledException(Exception e) {
        log.error("Error occurred: ", e);
        return Result.error("未知异常，请查看日志");
    }
}