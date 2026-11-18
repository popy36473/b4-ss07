package com.example.demo.service;

import com.example.demo.dto.request.EmployeeCreateDTO;
import com.example.demo.entity.Employee;

public interface EmployeeService {
    Employee create(EmployeeCreateDTO dto);
}