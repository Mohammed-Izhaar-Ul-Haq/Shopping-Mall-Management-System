package com.tnsif.customer;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.DynamicTest.stream;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.context.junit4.SpringRunner;

import com.tnsif.customer.entity.Customer;
import com.tnsif.customer.repository.CustomerRepository;
import com.tnsif.customer.service.CustomerService;
@RunWith(SpringRunner.class)
@SpringBootTest
class CustomerApplicationTests {
	@MockBean
	private CustomerRepository repo;
	@Autowired
	private CustomerService service;
	
	@Test
	public void listAllTest(){
			
		when(repo.findAll()).thenReturn(Stream.of(new Customer(1,"name","email","phone"),new Customer(2,"namew","ewmail","pwhone")).collect(Collectors.toList()));
	assertEquals(2,service.listAll().size());		
	}
}

