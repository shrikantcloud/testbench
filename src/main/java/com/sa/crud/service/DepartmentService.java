package com.sa.crud.service;

import com.sa.crud.model.Department;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DepartmentService {
    public List<Department> getDepartments();

    public Department saveDepartment(Department department);

    public Department updateDepartmentByDepartmentNo(Integer id, Department dept);

    public String deleteDepartmentById(Integer id);

}
