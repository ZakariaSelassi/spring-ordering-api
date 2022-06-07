package com.example.springapi.controller;

import com.example.springapi.model.dto.CustomersDTO;
import com.example.springapi.model.dto.OrdersDTO;
import com.example.springapi.services.OrderService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/orders")
public class OrdersController {

    private final OrderService service;

    public OrdersController(OrderService service) {
        this.service = service;
    }

    @GetMapping("/all")
    public List<OrdersDTO> displayAll(){
        return service.getAll();
    }

    @DeleteMapping("/delete/{id}")
    public String deleteOrder(@PathVariable long id){
        service.delete(id);
        return "Deleted Order";
    }


}
