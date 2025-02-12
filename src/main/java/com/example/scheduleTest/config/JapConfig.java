package com.example.scheduleTest.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;


@Configuration
@EnableJpaAuditing
public class JapConfig {
    // Entity 생성일, 수정일 자동 관리
}
