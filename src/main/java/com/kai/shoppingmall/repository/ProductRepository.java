package com.kai.shoppingmall.repository;

import com.kai.shoppingmall.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product,Integer> {

    @Query("update Product p set p.status = ?1")
    Integer changedStatus(Integer statusCode);
}
