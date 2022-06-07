package com.example.springapi.controller;

import com.example.springapi.model.dto.CustomersDTO;
import com.example.springapi.model.entity.Customers;
import com.example.springapi.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/customers")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @GetMapping
    public Set<CustomersDTO> getCustomers(){
        return this.customerService.findAll();
    }

    @PostMapping
    public CustomersDTO createCustomer(@RequestBody Customers customers){
        return this.customerService.save(customers);
    }

}
