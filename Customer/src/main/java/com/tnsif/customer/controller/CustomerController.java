package com.tnsif.customer.controller;

import java.util.List;
import java.util.NoSuchElementException;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tnsif.customer.entity.Customer;
import com.tnsif.customer.exceptions.CustomerNotFoundException;
import com.tnsif.customer.service.CustomerService;

@RestController
public class CustomerController {
	@Autowired
	private CustomerService service;

//RESTful API methods for Retrieval operations
	@GetMapping("/customer")
	public List<Customer> list() {
		return service.listAll();
	}

//RESTful API methods for Retrieval operations by id
	@GetMapping("/customer/{id}")
	public ResponseEntity<Customer> get(@PathVariable int id) throws CustomerNotFoundException {
		return ResponseEntity.ok(service.get(id));

	}

// RESTful API method for Create operation
	@PostMapping("/customer")
	public void add(@RequestBody @Valid Customer customer) {
		service.save(customer);
	}

// RESTful API method for Update operation
	@PutMapping("/customer/{id}")
	public ResponseEntity<?> update(@RequestBody Customer customer, @PathVariable Integer id)
			throws CustomerNotFoundException {
		try {
			Customer existCustomer = service.get(id);
			service.save(customer);
			return new ResponseEntity<>(HttpStatus.OK);
		} catch (NoSuchElementException e) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}

// RESTful API method for Delete operation
	@DeleteMapping("/customer/{id}")
	public void delete(@PathVariable Integer id) {
		service.delete(id);
	}
}
