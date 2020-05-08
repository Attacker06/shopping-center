package com.kai.shoppingmall.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer employeeId;

    @Column
    private String employeeName;

    @Column
    private String employeeGender;

    @JoinColumn
    @OneToMany
    private List<ProblemReport> problemReportList;

    public Integer getEmployeeId() {
        return employeeId;
    }
    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }
    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getEmployeeGender() {
        return employeeGender;
    }
    public void setEmployeeGender(String employeeGender) {
        this.employeeGender = employeeGender;
    }

    public List<ProblemReport> getProblemReportList() {
        return problemReportList;
    }
    public void setProblemReportList(List<ProblemReport> problemReportList) {
        this.problemReportList = problemReportList;
    }
}