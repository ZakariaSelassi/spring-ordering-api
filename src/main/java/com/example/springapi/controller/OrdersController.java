package com.example.springapi.controller;

import com.example.springapi.model.dto.OrdersDTO;
import com.example.springapi.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Set;

@RestController
@RequestMapping("/orders")
public class OrdersController {

    @Autowired
    private OrderService orderService;
    @GetMapping
    public Set<OrdersDTO> allOrders(){
        return this.orderService.getOrders();
    }

    @PostMapping
    public OrdersDTO 
}
