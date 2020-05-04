package com.kai.shoppingmall.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table
public class ProblemReport {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer problemReportId;

    @Column
    private String problemGist;

    @Column
    private String problemDetail;

    @Column
    private Date reportDate;

    @Column
    private Date resolutionDate;

    @Column
    private Boolean solveOrNot;

    @JoinColumn
    @ManyToOne
    private Employee employee;

    @JoinColumn
    @ManyToOne
    private Member member;

    public Integer getProblemReportId() {
        return problemReportId;
    }

    public void setProblemReportId(Integer problemReportId) {
        this.problemReportId = problemReportId;
    }

    public String getProblemGist() {
        return problemGist;
    }

    public void setProblemGist(String problemGist) {
        this.problemGist = problemGist;
    }

    public String getProblemDetail() {
        return problemDetail;
    }

    public void setProblemDetail(String problemDetail) {
        this.problemDetail = problemDetail;
    }

    public Date getReportDate() {
        return reportDate;
    }

    public void setReportDate(Date reportDate) {
        this.reportDate = reportDate;
    }

    public Date getResolutionDate() {
        return resolutionDate;
    }

    public void setResolutionDate(Date resolutionDate) {
        this.resolutionDate = resolutionDate;
    }

    public Boolean getSolveOrNot() {
        return solveOrNot;
    }

    public void setSolveOrNot(Boolean solveOrNot) {
        this.solveOrNot = solveOrNot;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Member getMember() {
        return member;
    }

    public void setMember(Member member) {
        this.member = member;
    }
}
