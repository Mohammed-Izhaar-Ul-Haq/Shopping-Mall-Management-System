package com.tnsif.customer.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tnsif.customer.entity.OrderDetails;

public interface OrderDetailsRepository extends JpaRepository<OrderDetails, Integer> {

}
