package com.sprata.my_schedule.dto;

import com.sprata.my_schedule.entity.Schedule;
import lombok.Getter;

@Getter
public class ScheduleResponseDto {
    private String title;
    private String text;
    private String manager;
    private String date;

    public ScheduleResponseDto(Schedule schedule) {
        this.title = schedule.getTitle();
        this.text = schedule.getText();
        this.manager = schedule.getManager();
        this.date = schedule.getDate();
    }
}
