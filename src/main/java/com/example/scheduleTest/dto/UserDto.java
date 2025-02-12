package com.example.scheduleTest.dto;


import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@NotBlank
public class UserDto {


    @NotBlank(message = "유저명은 필수 입력 값입니다.")
    @Size(min = 1, max = 20, message = "유저명은 1자 이상, 20자 이하로 입력하세요.")
    private String username;

    @NotBlank(message = "이메일은 필수 입력 값입니다.")
    @Email(message = "올바른 이메일 형식이 아닙니다.")
    private String email;

    @NotBlank
    @Size(min = 8, max = 20)
    private String password;
}
