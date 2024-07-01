package com.sa.crud.service.impl;

import com.sa.crud.model.Department;
import com.sa.crud.repository.DepartmentRepository;
import com.sa.crud.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class DepartmentServiceImpl implements DepartmentService {

    @Autowired
    private DepartmentRepository departmentRepository;

    @Override
    public List<Department> getDepartments() {
        return departmentRepository.findAll();
    }

    @Override
    public Department saveDepartment(Department department) {
        return departmentRepository.save(department);
    }

    @Override
    public Department updateDepartmentByDepartmentNo(Integer id, Department dept) {
        Optional<Department> existingDepartment = departmentRepository.findById(id);
        if (existingDepartment.isPresent()) {
            Department dept1 = existingDepartment.get();
            if (Objects.nonNull(dept1.getDeptName()) && !"".equalsIgnoreCase(dept1.getDeptName())) {
                dept1.setDeptNo(dept.getDeptNo());
                dept1.setDeptName(dept.getDeptName());
                dept1.setDeptLocation(dept.getDeptLocation());
            }
            return departmentRepository.save(dept1);
        }
        return null;
    }

    @Override
    public String deleteDepartmentById(Integer id) {
        if (departmentRepository.findById(id).isPresent()) {
            departmentRepository.deleteById(id);
            return ("Department Deleted bearing id = " + id);
        }
        return "Department does not exist for id = " + id;
    }

    @Override
    public Department getDepartmentById(Integer id) {
        Optional<Department> dept = departmentRepository.findById(id);
        if (dept.isPresent()) {
            return dept.get();
        }
        return null;
    }
}
