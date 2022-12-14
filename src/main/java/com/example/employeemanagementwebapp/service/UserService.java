package com.example.employeemanagementwebapp.service;

import com.example.employeemanagementwebapp.dto.UserRegistrationDto;
import com.example.employeemanagementwebapp.model.User;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {
    User save(UserRegistrationDto registrationDto);
}
