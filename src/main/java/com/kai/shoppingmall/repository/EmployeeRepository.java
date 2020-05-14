package com.kai.shoppingmall.repository;

import com.kai.shoppingmall.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Integer> {

    @Query(value = "SELECT * FROM Employee where account = ?1",nativeQuery = true)
    Employee getEmployeeByAccount(String account);
}
