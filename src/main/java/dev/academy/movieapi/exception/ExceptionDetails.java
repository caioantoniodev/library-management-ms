package dev.academy.movieapi.exception;

import lombok.Data;
import lombok.experimental.SuperBuilder;

import java.time.LocalDateTime;

@Data
@SuperBuilder
public class ExceptionDetails {
    private String description;
    private int status;
    private LocalDateTime timeStamp;
}