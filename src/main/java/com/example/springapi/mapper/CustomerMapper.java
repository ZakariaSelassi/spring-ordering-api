package com.example.springapi.mapper;

import com.example.springapi.model.dto.CustomersDTO;
import com.example.springapi.model.entity.Customers;
import org.springframework.stereotype.Service;

import java.util.Set;
import java.util.stream.Collectors;

@Service
public class CustomerMapper {

    public CustomersDTO convertTODTO(Customers customers){
        if(customers == null)return null;
        CustomersDTO dto = new CustomersDTO();
        dto.setIdCustomer(customers.getIdCustomer());
        dto.setLastname(customers.getLastname());
        dto.setFirstname(customers.getFirstname());
        Set<CustomersDTO.SmallOrderDTO> rslt = customers.getOrders().stream().map(CustomersDTO.SmallOrderDTO::of).collect(Collectors.toSet());
        dto.setOrderDTOS(rslt);
        return dto;
    }

    public Customers convertToEntity(CustomersDTO customersDTO){
        if(customersDTO == null) return null;
        Customers entity = new Customers();
        entity.setIdCustomer(customersDTO.getIdCustomer());
        entity.setFirstname(customersDTO.getFirstname());
        entity.setLastname(customersDTO.getLastname());

        return entity;
    }


}
