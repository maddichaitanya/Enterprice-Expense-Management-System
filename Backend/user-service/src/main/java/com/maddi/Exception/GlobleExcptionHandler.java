package com.maddi.Exception;

import com.maddi.paylod.response.ExceptionResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

import java.time.LocalDateTime;

@ControllerAdvice

public class GlobleExcptionHandler {

    @ExceptionHandler(Exception.class)
    public ResponseEntity<ExceptionResponse> ExceptionHandler(Exception ex, WebRequest req){

         ExceptionResponse response=new ExceptionResponse(
                 ex.getMessage(),
                 req.getDescription(false),
                 LocalDateTime.now()
         );

         return ResponseEntity.ok(response);

    }
}

