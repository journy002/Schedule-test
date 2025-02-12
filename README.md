### ✨ Schedule Management API


## ✔️ 과제 개요

API 명세서 구성

교환: HTTP Methods (회선: GET, 복수: POST, 수정: PUT, 삭제: DELETE)

패키지 경로

├── controller
│   ├── ScheduleController.java
│   ├── UserController.java
├── dto
│   ├── ScheduleDto.java
│   ├── UserDto.java
├── entity
│   ├── Schedule.java
│   ├── User.java
├── repository
│   ├── ScheduleRepository.java
│   ├── UserRepository.java
├── service
│   ├── ScheduleService.java
│   ├── UserService.java
├── ScheduleApplication.java


## ✨ API 명세서

| HTTP Method | URI                   | Description    |
|------------|-----------------------|--------------|
| **POST**   | `/api/users`          | 유저 생성    |
| **GET**    | `/api/users/{id}`     | 유저 조회    |
| **PUT**    | `/api/users/{id}`     | 유저 수정    |
| **DELETE** | `/api/users/{id}`     | 유저 삭제    |
| **POST**   | `/api/schedules`      | 일정 생성    |
| **GET**    | `/api/schedules/{id}` | 일정 조회    |
| **PUT**    | `/api/schedules/{id}` | 일정 수정    |
| **DELETE** | `/api/schedules/{id}` | 일정 삭제    |


## 테이블 생성 SQL (schedule.sql)

CREATE TABLE User (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    username VARCHAR(20) NOT NULL,
    email VARCHAR(255) NOT NULL UNIQUE,
    password VARCHAR(100) NOT NULL,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP
);

CREATE TABLE Schedule (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    user_id BIGINT NOT NULL,
    title VARCHAR(255) NOT NULL,
    description TEXT,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
    FOREIGN KEY (user_id) REFERENCES User(id) ON DELETE CASCADE
);
