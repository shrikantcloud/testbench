package com.sa.crud.service.impl;

import com.sa.crud.model.SalaryGrade;
import com.sa.crud.repository.SalaryGradeRepository;
import com.sa.crud.service.SalaryGradeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SalaryGradeServiceImpl implements SalaryGradeService {

    @Autowired
    private SalaryGradeRepository salaryGradeRepository;

    @Override
    public List<SalaryGrade> getSalaryGrade() {
        return salaryGradeRepository.findAll();
    }
}
