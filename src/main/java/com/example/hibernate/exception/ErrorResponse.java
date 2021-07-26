package com.example.hibernate.exception;

import java.time.*;
import lombok.*;

@Data
public class ErrorResponse {

    private Integer status;
    private String error;
    private String message;
    private LocalDateTime date;
}
