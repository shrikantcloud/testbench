package com.sa.crud.repository;

import com.sa.crud.model.SalaryGrade;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SalaryGradeRepository extends JpaRepository<SalaryGrade, Integer> {
}
