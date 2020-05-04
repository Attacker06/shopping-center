package com.kai.shoppingmall.repository;

import com.kai.shoppingmall.entity.ProblemReport;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProblemReportRepository extends JpaRepository<ProblemReport,Integer> {
}
