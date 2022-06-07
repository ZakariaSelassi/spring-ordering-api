package com.example.springapi.mapper;


import com.example.springapi.model.dto.OrdersDTO;
import com.example.springapi.model.entity.Orders;
import org.springframework.stereotype.Service;

import java.util.Set;
import java.util.stream.Collectors;

@Service
public class OrdersMapper {


    public OrdersDTO convertToDTO(Orders order){
        if(order == null)return null;

        OrdersDTO dto = new OrdersDTO();
        dto.setId_order(order.getId_order());
        dto.setDateTime(order.getDateTime());
        Set<OrdersDTO.SmallMenuDTO> rslt = order.getMenus().stream()
                        .map(OrdersDTO.SmallMenuDTO::of).collect(Collectors.toSet());
        dto.setMenus(rslt);
        return dto;
    }
}
