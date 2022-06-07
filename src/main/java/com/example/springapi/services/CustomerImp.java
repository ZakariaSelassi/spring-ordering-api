package com.example.springapi.services;

import com.example.springapi.mapper.CustomerMapper;
import com.example.springapi.model.dto.CustomersDTO;
import com.example.springapi.model.repository.CustomerRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerImp implements  CustomerService{

    private final CustomerRepository repository;
    private final CustomerMapper mapper;

    public CustomerImp(CustomerRepository repository, CustomerMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    @Override
    public List<CustomersDTO> getAll() {
            return null;
    }

    @Override
    public CustomersDTO getById(long id) {
        return null;
    }

    @Override
    public long insert(CustomersDTO customer) {
        return 0;
    }

    @Override
    public void update(long id, CustomersDTO customers) {

    }

    @Override
    public String delete(long id) {
        return null;
    }
}
