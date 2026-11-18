package com.example.demo.controller;

import com.example.demo.dto.request.DepartmentCreateDTO;
import com.example.demo.dto.response.ApiResponse;
import com.example.demo.entity.Department;
import com.example.demo.service.DepartmentService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/departments")
@RequiredArgsConstructor
public class DepartmentController {

    private final DepartmentService service;

    @PostMapping
    public ResponseEntity<ApiResponse<Department>> create(
            @Valid @RequestBody DepartmentCreateDTO dto) {

        Department department = service.create(dto);

        return ResponseEntity.status(201).body(
                new ApiResponse<>(
                        "SUCCESS",
                        "Tạo phòng ban thành công",
                        department
                )
        );
    }
}