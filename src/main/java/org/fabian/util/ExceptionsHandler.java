package org.fabian.util;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ExceptionsHandler{

    public static final String PRICE_NOT_FOUND = "PRICE NOT FOUND";

    @ExceptionHandler(RuntimeException.class)
    @ResponseStatus(value = HttpStatus.BAD_REQUEST)
    public String badRequest(final Exception exception) {
        return PRICE_NOT_FOUND;
    }

}
