package com.example.demo.service;

import com.example.demo.dto.request.DepartmentCreateDTO;
import com.example.demo.entity.Department;

public interface DepartmentService {
    Department create(DepartmentCreateDTO dto);
}