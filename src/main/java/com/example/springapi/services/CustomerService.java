package com.example.springapi.services;

import com.example.springapi.model.dto.CustomersDTO;

import java.util.List;

public interface CustomerService {
    List<CustomersDTO> getAll();
    CustomersDTO getById(long id);
    long insert(CustomersDTO customer);
    void update(long id,CustomersDTO customers);
    String delete(long id);
}
