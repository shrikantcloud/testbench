package com.sa.crud.controller.rest;

import com.sa.crud.model.Department;
import com.sa.crud.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/testbench")
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    @GetMapping("/departments")
    public ResponseEntity<List<Department>> getDepatments() {
        return new ResponseEntity<>(departmentService.getDepartments(), HttpStatus.OK);
    }

    @PostMapping("/department")
    public ResponseEntity<Department> saveDepartment(@RequestBody Department department) {
        return new ResponseEntity<>(departmentService.saveDepartment(department), HttpStatus.CREATED);
    }

    @PutMapping("/department/{id}")
    public ResponseEntity<Department> updateDepartment(@PathVariable("id") Integer id, @RequestBody Department department) {
        return new ResponseEntity<>(departmentService.updateDepartmentByDepartmentNo(id, department), HttpStatus.OK);
    }

    @DeleteMapping("/department/{id}")
    public ResponseEntity<String> deleteDepartment(@PathVariable("id") Integer id) {
        return new ResponseEntity<>(departmentService.deleteDepartmentById(id), HttpStatus.OK);
    }

}
