package com.tnsif.service;

import java.util.ArrayList;
import java.util.List;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;

import com.tnsif.customer.entity.Customer;
import com.tnsif.customer.repository.CustomerRepository;

/*
 * @SpringBootTest class CustomerServiceTest {
 * 
 * @MockBean private CustomerRepository repo;
 * 
 * @Autowired private CustomerService service;
 * 
 * @Test public void listAllTest(){
 * 
 * when(repo.findAll()).thenReturn(Stream.of(new
 * Customer(1,"name","email","phone"),new
 * Customer(2,"namew","ewmail","pwhone")).collect(Collectors.toList()));
 * assertEquals(2,service.listAll().size()); } }
 */
//@SpringBootTest
//public class CustomerServiceTest {
//    @Mock
//    private CustomerRepository repo;
//
//    @InjectMocks
//    private CustomerService customerService;
//
//    @Test
//    public void testListAll() {
//        // Arrange
//        List<Customer> customers = new ArrayList<>();
//        customers.add(new Customer(1,"John@","email","phone"));
//        customers.add(new Customer(2,"John@2","email2","phone2"));
//
//        Mockito.when(repo.findAll()).thenReturn(customers);
//
//        // Act
//        List<Customer> result = customerService.listAll();
//
//        // Assert
//        Assertions.assertEquals(2, result.size());
//        Assertions.assertEquals(1,"John@","email","phone", result.get(0).getName());
//        Assertions.assertEquals(2,"John@2","email2","phone2", result.get(1).getName());
//        Mockito.verify(repo, Mockito.times(1)).findAll();
    
