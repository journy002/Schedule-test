package com.example.scheduleTest.service;

import com.example.scheduleTest.dto.ScheduleDto;
import com.example.scheduleTest.entity.Schedule;
import com.example.scheduleTest.entity.User;
import com.example.scheduleTest.repository.ScheduleRepository;
import com.example.scheduleTest.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class ScheduleService {

    private final ScheduleRepository scheduleRepository;
    private final UserRepository userRepository;

    @Transactional
    public Schedule createSchedule(ScheduleDto scheduleDto) {
        User user = userRepository.findById(scheduleDto.getUserId())
                .orElseThrow(() -> new IllegalArgumentException("유효하지 않은 유저 ID 입니다."));

        Schedule schedule = Schedule.builder()
                .title(scheduleDto.getContent())
                .content(scheduleDto.getContent())
                .user(user)
                .build();
        return scheduleRepository.save(schedule);
    }
}
