package com.example.springapi.services;


import com.example.springapi.mapper.OrdersMapper;
import com.example.springapi.model.dto.OrdersDTO;
import com.example.springapi.model.entity.Orders;
import com.example.springapi.model.repository.OrdersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;
import java.util.stream.Collectors;

@Service
public class OrderService {

    private final OrdersRepository ordersRepository;
    @Autowired
    private OrdersMapper ordersMapper;

    public OrderService(OrdersRepository ordersRepository) {
        this.ordersRepository = ordersRepository;
    }

    public Set<OrdersDTO> getOrders(){
        return this.ordersRepository.findAll().stream().map(ordersMapper::convertToDTO).collect(Collectors.toSet());
    }
    public OrdersDTO save(Orders orders){
        return this.ordersMapper.convertToDTO(this.ordersRepository.save(orders));
    }
}
