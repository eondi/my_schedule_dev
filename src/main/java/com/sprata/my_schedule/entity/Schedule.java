package com.sprata.my_schedule.entity;

import com.sprata.my_schedule.dto.ScheduleRequestDto;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
public class Schedule {
    private Integer number;
    private String title;
    private String text;
    private String manager;
    private String pw;
    private Date date;

    public Schedule(ScheduleRequestDto requestDto) {
        this.title = requestDto.getTitle();
        this.text = requestDto.getText();
        this.manager = requestDto.getManager();
        this.pw = requestDto.getPw();
        this.date = requestDto.getDate();


    }

    public void update(ScheduleRequestDto requestDto) {
        this.title = requestDto.getTitle();
        this.text = requestDto.getText();
        this.manager = requestDto.getManager();
    }
}
