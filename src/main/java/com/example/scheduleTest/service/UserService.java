package com.example.scheduleTest.service;

import com.example.scheduleTest.dto.UserDto;
import com.example.scheduleTest.entity.User;
import com.example.scheduleTest.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    @Transactional
    public User createUser(UserDto userDto) {
        User user = User.builder()
                .username(userDto.getUsername())
                .email(userDto.getEmail())
                .password(userDto.getPassword())
                .build();
        return userRepository.save(user);
    }
}
