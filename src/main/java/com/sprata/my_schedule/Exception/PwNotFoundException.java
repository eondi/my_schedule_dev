package com.sprata.my_schedule.Exception;

import lombok.Getter;

@Getter
public class PwNotFoundException extends RuntimeException {
    private final String PW;
    public PwNotFoundException(String pw) {
        this.PW = pw;
    }
}
