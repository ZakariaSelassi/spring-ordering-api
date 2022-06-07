package com.example.springapi.controller;

import com.example.springapi.model.dto.CustomersDTO;
import com.example.springapi.services.CustomerService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customers")
public class CustomerController {

    private final CustomerService service;

    public CustomerController(CustomerService service) {
        this.service = service;
    }

    @GetMapping("/all")
    public List<CustomersDTO> displayAll(){
        return service.getAll();
    }

    @PostMapping("/add")
    public long createCustomer(@RequestBody CustomersDTO customersDTO){
        System.out.println("From postman : " + customersDTO);
        return service.insert(customersDTO);
    }

    @PutMapping("/edit/{id}")
    public void editCustomer(@PathVariable long id, @RequestBody CustomersDTO customersDTO){
        service.update(id, customersDTO);
        System.out.println("From postman : " + customersDTO);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteCustomer(@PathVariable long id){
        service.delete(id);
        return "Deleted Customers";
    }

}
