package com.example.springapi.mapper;

import com.example.springapi.model.dto.CustomersDTO;
import com.example.springapi.model.entity.Customers;
import org.springframework.stereotype.Service;

import java.util.Set;
import java.util.stream.Collectors;

@Service
public class CustomersMapper {

    public CustomersDTO convertToDTO(Customers customers){
        if(customers == null) return null;

        CustomersDTO dto = new CustomersDTO();
        dto.setFirst_name(customers.getFirst_name());
        dto.setLast_name(customers.getLast_name());
        dto.setPhone(customers.getPhone());
        Set<CustomersDTO.SmallOrderDTO> rslt = customers.getOrders().stream()
                        .map(CustomersDTO.SmallOrderDTO::of)
                        .collect(Collectors.toSet());
        dto.setOrdersDTO(rslt);
        return dto;
    }
}
