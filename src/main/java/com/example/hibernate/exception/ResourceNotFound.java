package com.example.hibernate.exception;

import java.time.*;
import lombok.*;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

@Getter
@Setter
@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class ResourceNotFound extends RuntimeException {

    private LocalDateTime date;

    public ResourceNotFound() {
        this.setDate(LocalDateTime.now());
    }

    public ResourceNotFound(String message) {
        super(message);
        this.setDate(LocalDateTime.now());
    }
}
