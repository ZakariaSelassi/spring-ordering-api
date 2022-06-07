package com.example.springapi.services;

import com.example.springapi.mapper.CustomerMapper;
import com.example.springapi.model.dto.CustomersDTO;
import com.example.springapi.model.entity.Customers;
import com.example.springapi.model.repository.CustomerRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

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

        return repository.findAll().stream().map(mapper::convertTODTO).collect(Collectors.toList());
    }

    @Override
    public CustomersDTO getById(long id) {
        return repository.findById(id).map(mapper::convertTODTO).orElseThrow();
    }

    @Override
    public long insert(CustomersDTO customer) {
        Customers entity = mapper.convertToEntity(customer);
        entity = repository.save(entity);
        return entity.getIdCustomer();
    }

    @Override
    public void update(long id, CustomersDTO customers) {
        Customers entity = mapper.convertToEntity(customers);
        entity.setIdCustomer(id);
        repository.save(entity);
    }

    @Override
    public String delete(long id) {
        repository.deleteById(id);
        return "Deleted Customers";

    }
}
