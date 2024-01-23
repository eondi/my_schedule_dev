package com.sprata.my_schedule.Exception;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.time.LocalDateTime;

@Data
@RequiredArgsConstructor
public class ErrorResult {
    private LocalDateTime timeStamp = LocalDateTime.now();
    private final int httpStatusCode;
    private final String message;
}
