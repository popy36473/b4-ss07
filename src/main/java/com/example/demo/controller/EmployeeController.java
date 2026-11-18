package com.example.demo.controller;

import com.example.demo.dto.request.EmployeeCreateDTO;
import com.example.demo.dto.response.ApiResponse;
import com.example.demo.entity.Employee;
import com.example.demo.service.EmployeeService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/employees")
@RequiredArgsConstructor
public class EmployeeController {

    private final EmployeeService service;

    @PostMapping
    public ResponseEntity<ApiResponse<Employee>> create(
            @Valid @RequestBody EmployeeCreateDTO dto) {

        Employee employee = service.create(dto);

        return ResponseEntity.status(201).body(
                new ApiResponse<>(
                        "SUCCESS",
                        "Tạo nhân viên thành công",
                        employee
                )
        );
    }
}