package com.sa.crud.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity(name = "salgrade")
public class SalaryGrade {
    @Id
    @Column(name = "grade")
    public Integer salGrade;
    @Column(name = "hisal")
    public Integer hiSalary;
    @Column(name = "losal")
    public Integer lowSalary;
}
