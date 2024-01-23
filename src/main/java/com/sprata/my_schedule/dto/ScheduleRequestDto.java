package com.sprata.my_schedule.dto;

import jakarta.validation.constraints.NotNull;
import lombok.Getter;

@Getter
public class ScheduleRequestDto {
    @NotNull(message = "Tiltle은 필수 입니다")
    private String title;

    private String text;
    private String manager;
    private String pw;
    private String date;
}
