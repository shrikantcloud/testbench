package com.sa.crud.restcontroller;

import com.sa.crud.model.SalaryGrade;
import com.sa.crud.service.SalaryGradeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SalaryGradeController {

    @Autowired
    private SalaryGradeService salaryGradeService;

    @GetMapping("/salgrade")
    public List<SalaryGrade> getSalaryGrade() {
        return salaryGradeService.getSalaryGrade();
    }


}
