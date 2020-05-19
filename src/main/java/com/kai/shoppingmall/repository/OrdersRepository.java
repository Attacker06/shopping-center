package com.kai.shoppingmall.repository;

import com.kai.shoppingmall.entity.Orders;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrdersRepository extends JpaRepository<Orders,Integer> {

    @Query(value = "select o from Orders o where o.orderAmount >= ?1")
    List<Orders> findOrderByAmount(Double amount);
}
