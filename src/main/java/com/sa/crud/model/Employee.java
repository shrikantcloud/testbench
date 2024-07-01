package com.sa.crud.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity(name = "emp")
public class Employee {

    @Id
    @Column(name = "empno")
    private Integer empNo;
    @Column(name = "ename")
    private String empName;
    @Column(name = "job")
    private String jobRole;
    @Column(name = "mgr")
    private Integer ManagerId;
    @Column(name = "hiredate")
    private Date hireDate;
    @Column(name = "sal")
    private Double salary;
    @Column(name = "comm")
    private Double commission;
    @Column(name = "deptno")
    private Integer deptNo;

//    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
//    @ManyToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name = "deptno")
//    private Department department;
}
