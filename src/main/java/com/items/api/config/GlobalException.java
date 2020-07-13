package com.items.api.config;

import com.items.api.util.exception.TextException;
import com.items.api.util.pojo.DataResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalException {
    private static final Logger logger = LoggerFactory.getLogger(GlobalException.class);

    @ExceptionHandler
    public ResponseEntity<Object> exception(Exception exception) {
        if (exception instanceof TextException) {
            logger.warn(exception.getMessage());
            return new ResponseEntity<>(DataResponse.error(exception.getMessage()), HttpStatus.OK);
        }
        return new ResponseEntity<>(DataResponse.error("something is wrong"), HttpStatus.OK);
    }
}
