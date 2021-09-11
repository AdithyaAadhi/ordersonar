package com.shopping.onlineshopping.order.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shopping.onlineshopping.order.entity.Order;

public interface ReorderRepository extends JpaRepository<Order, String>{
	Order findByOrderid(String orderid);
}
