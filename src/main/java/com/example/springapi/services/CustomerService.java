package com.example.springapi.services;

import com.example.springapi.mapper.CustomersMapper;
import com.example.springapi.model.dto.CustomersDTO;
import com.example.springapi.model.entity.Customers;
import com.example.springapi.model.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@Service
public class CustomerService {

    private final CustomerRepository customerRepository;
    @Autowired
    private CustomersMapper customersMapper;

    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public Set<CustomersDTO> findAll(){
        return this.customerRepository.findAll().stream().map(customersMapper::convertToDTO).collect(Collectors.toSet());
    }

    public CustomersDTO save(Customers customers){
        return this.customersMapper.convertToDTO(this.customerRepository.save(customers));
    }

}
