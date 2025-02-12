package com.example.scheduleTest.controller;

import com.example.scheduleTest.dto.ScheduleDto;
import com.example.scheduleTest.entity.Schedule;
import com.example.scheduleTest.service.ScheduleService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/schedule")
@RequiredArgsConstructor
public class ScheduleController {

    private final ScheduleService scheduleService;

    @PostMapping
    public ResponseEntity<Schedule> createSchedule(@Valid @RequestBody ScheduleDto scheduleDto) {
        Schedule schedule = scheduleService.createSchedule(scheduleDto);
        return ResponseEntity.ok(schedule);
    }
}
