package com.tnsif.customer.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tnsif.customer.entity.Customer;
import com.tnsif.customer.exceptions.CustomerNotFoundException;
import com.tnsif.customer.repository.CustomerRepository;

@Service
@Transactional
public class CustomerService {
	@Autowired
	private CustomerRepository repo;

	public List<Customer> listAll() {
		return repo.findAll();
	}

	public void save(Customer customer) {
		repo.save(customer);
	}

	public Customer get(int id) throws CustomerNotFoundException {
		Optional<Customer> optionalCustomer = repo.findById(id);

		if (optionalCustomer.isPresent()) {
			return optionalCustomer.get();
		} else {
			throw new CustomerNotFoundException("User not found with id: " + id);
		}
	}

	public void delete(int id) {
		repo.deleteById(id);
	}

}
