package com.sa.crud.controller.mvc;

import com.sa.crud.model.Department;
import com.sa.crud.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

// https://www.javaguides.net/2020/05/spring-boot-crud-web-application-with-thymeleaf.html
@Controller
public class DepartmentMVCController {

    @Autowired
    private DepartmentService departmentService;

    @GetMapping("/")
    public String viewHomePage(Model model) {
        model.addAttribute("listDepartments", departmentService.getDepartments());
        return "index";
    }

    @GetMapping("/showNewDepartmentForm")
    public String showNewDepartmentForm(Model model) {
        Department department = new Department();
        model.addAttribute("department", department);
        return "new_department";
    }

    @PostMapping("/saveDepartment")
    public String saveDepartment(@ModelAttribute("department") Department department) {
        this.departmentService.saveDepartment(department);
        return "redirect:/";
    }

    @GetMapping("/showFormForUpdate/{deptNo}")
    public String showFormForUpdate(@PathVariable(value = "deptNo") Integer deptNo, Model model) {
        Department dept = departmentService.getDepartmentById(deptNo);
        model.addAttribute("department", dept);
        return "update_department";
    }

    @GetMapping("/deleteDepartment/{deptNo}")
    public String deleteDepartment(@PathVariable(value = "deptNo") Integer deptNo) {
        this.departmentService.deleteDepartmentById(deptNo);
        return "redirect:/";
    }


}
