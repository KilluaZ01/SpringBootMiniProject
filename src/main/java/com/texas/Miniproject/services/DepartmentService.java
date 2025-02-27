package com.texas.Miniproject.services;

import com.texas.Miniproject.entity.Department;

import java.util.List;
import java.util.Optional;

public interface DepartmentService {
    Department saveDepartment(Department department);

    List<Department> listAllDepartment();

    Optional<Department> getDepartmentById(Long id);
}
