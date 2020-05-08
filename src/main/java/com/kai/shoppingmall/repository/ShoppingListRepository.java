package com.kai.shoppingmall.repository;

import com.kai.shoppingmall.entity.ShoppingList;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShoppingListRepository extends JpaRepository<ShoppingList,Integer> {
}
