package com.example.scheduleTest.controller;

import com.example.scheduleTest.dto.UserDto;
import com.example.scheduleTest.entity.User;
import com.example.scheduleTest.service.UserService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @PostMapping
    public ResponseEntity<User> createUser(@Valid @RequestBody UserDto userDto) {
        User savedUser = userService.createUser(userDto);
        return ResponseEntity.ok(savedUser);
    }
}
