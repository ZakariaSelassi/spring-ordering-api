package com.example.springapi.mapper;

import com.example.springapi.model.dto.OrdersDTO;
import com.example.springapi.model.entity.Orders;
import org.springframework.stereotype.Service;

import java.util.Set;
import java.util.stream.Collectors;

@Service
public class OrdersMapper {

    public OrdersDTO convertToDTO(Orders orders){
        if(orders == null)return null;

        OrdersDTO dto = new OrdersDTO();
        dto.setDateOrder(orders.getDateOrder());
        Set<OrdersDTO.SmallMenuDTO> rslt = orders.getMenus().stream().map(OrdersDTO.SmallMenuDTO::of).collect(Collectors.toSet());
        dto.setMenus(rslt);
        return dto;

    }
}
