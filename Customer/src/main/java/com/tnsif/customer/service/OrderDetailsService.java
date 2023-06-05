package com.tnsif.customer.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tnsif.customer.entity.OrderDetails;
import com.tnsif.customer.repository.OrderDetailsRepository;

@Service
@Transactional
public class OrderDetailsService {

	@Autowired
	private OrderDetailsRepository repo;

	public List<OrderDetails> listAll() {
		return repo.findAll();
	}

	public void save(OrderDetails orderdetails) {
		repo.save(orderdetails);
	}

	public OrderDetails get(int id) {
		return repo.findById(id).get();
	}

	public void delete(int id) {
		repo.deleteById(id);
	}
}
