package com.example.scheduleTest.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ScheduleDto {

    @NotBlank(message = "제목은 필수 입력 값입니다.")
    private String title;

    @NotBlank(message = "제목은 필수 입력 값입니다.")
    private String content;

    private Long userId;
}
