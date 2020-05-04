package com.kai.shoppingmall.repository;

import com.kai.shoppingmall.entity.OrderList;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderListRepository extends JpaRepository<OrderList,Integer> {
}
