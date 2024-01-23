package com.sprata.my_schedule.controller;

import com.sprata.my_schedule.dto.ScheduleRequestDto;
import com.sprata.my_schedule.dto.ScheduleResponseDto;
import com.sprata.my_schedule.entity.Schedule;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class ScheduleController  {

    private final Map<String, Schedule> scheduleList = new HashMap<>();

    // 일정 작성 기능
    @PostMapping("/write")
    public ScheduleResponseDto createSchedule(@Valid @RequestBody ScheduleRequestDto requestDto){

        // RequestDto -> entity
        Schedule schedule  = new Schedule(requestDto);

        // 비밀번호를 키값으로 둔 맵 생성 , DB저장
        scheduleList.put(schedule.getPw(), schedule);

        // entity -> ResponseDto
        ScheduleResponseDto scheduleResponseDto = new ScheduleResponseDto(schedule);

        return scheduleResponseDto;

    }

     //일정 전체 조회 기능
    @GetMapping("/schedules")
    public List<ScheduleResponseDto> getSchedules(){
        // map -> list
        List<ScheduleResponseDto> responseList = scheduleList.values().stream().map(ScheduleResponseDto::new).toList();
        return  responseList;
    }
}
