package com.learningspringboot.hospitalManagement.dto;

import ch.qos.logback.core.joran.action.NOPAction;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class LoginResponseDto {
    String jwt;
    Long userId;
}
