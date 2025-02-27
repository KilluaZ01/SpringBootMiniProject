package com.texas.Miniproject.controllers;

import com.texas.Miniproject.entity.Department;
import com.texas.Miniproject.services.DepartmentService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/department")
public class DepartmentController {
    private final DepartmentService departmentService;

    public DepartmentController(DepartmentService departmentService) {
        this.departmentService = departmentService;
    }

    @PostMapping
    public ResponseEntity<Department> save(@RequestBody Department department){
        return new ResponseEntity<>(departmentService.saveDepartment(department), HttpStatus.CREATED);
    }

    @GetMapping
    public List<Department> listDepartment(){
        return departmentService.listAllDepartment();
    }

    @GetMapping("/{id}")
    public Optional<Department> getById(@PathVariable Long id){
        return departmentService.getDepartmentById(id);
    }
}
