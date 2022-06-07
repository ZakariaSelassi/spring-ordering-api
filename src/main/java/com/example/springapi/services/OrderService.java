package com.example.springapi.services;

import com.example.springapi.model.dto.OrdersDTO;
import org.springframework.stereotype.Service;

import java.util.List;


public interface OrderService {

    List<OrdersDTO> getAll();

    OrdersDTO getById(long id);

    long insert(OrdersDTO orders);

    void update(long id,OrdersDTO orders);

    String delete(long id);


}
