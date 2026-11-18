package com.example.demo.service.impl;

import com.example.demo.dto.request.DepartmentCreateDTO;
import com.example.demo.entity.Department;
import com.example.demo.repository.DepartmentRepository;
import com.example.demo.service.DepartmentService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DepartmentServiceImpl implements DepartmentService {

    private final DepartmentRepository repository;

    @Override
    public Department create(DepartmentCreateDTO dto) {

        Department department = new Department();
        department.setName(dto.getName());
        department.setDescription(dto.getDescription());

        return repository.save(department);
    }
}