package com.sa.crud.model;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import jakarta.persistence.Column;
import jakarta.persistence.Id;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity(name = "dept")
public class Department {
    @Id
    //@GeneratedValue(strategy= GenerationType.SEQUENCE)
    @Column(name = "deptno")
    private Integer deptNo;
    @Column(name = "dname")
    private String deptName;
    @Column(name = "loc")
    private String deptLocation;

//    @OneToMany
//    @JoinColumn(name = "deptno")
//    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
//    private List<Employee> employees;
}
