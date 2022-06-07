package com.example.springapi.services;

import com.example.springapi.mapper.OrdersMapper;
import com.example.springapi.model.dto.OrdersDTO;
import com.example.springapi.model.entity.Customers;
import com.example.springapi.model.entity.Orders;
import com.example.springapi.model.repository.OrdersRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
@Service
public class OrdersImp implements OrderService {

    private final OrdersRepository repository;
    private final OrdersMapper mapper;

    public OrdersImp(OrdersRepository repository, OrdersMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    @Override
    public List<OrdersDTO> getAll() {
        return repository.findAll().stream().map(mapper::convertToDTO).collect(Collectors.toList());
    }

    @Override
    public OrdersDTO getById(long id) {
        return repository.findById(id).map(mapper::convertToDTO).orElseThrow();
    }

    @Override
    public long insert(OrdersDTO orders) {

        Orders entity = mapper.convertToEntity(orders);
        entity = repository.save(entity);
        return entity.getIdOrder();
    }

    @Override
    public void update(long id, OrdersDTO orders) {

    }

    @Override
    public String delete(long id) {

        repository.deleteById(id);
       return "Delete successfuly !";
    }
}
