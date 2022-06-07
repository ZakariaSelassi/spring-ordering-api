package com.example.springapi.mapper;

import com.example.springapi.model.dto.AdminDTO;
import com.example.springapi.model.entity.Admin;
import org.springframework.stereotype.Service;

import java.util.Set;
import java.util.stream.Collectors;

@Service
public class AdmiMapper {


    public AdminDTO convertToDTO(Admin admin){

        if(admin == null)return null;

        AdminDTO dto = new AdminDTO();
        dto.setUsername(admin.getUsername());
        Set<AdminDTO.SmallStockDTO> rslt = admin.getStockList().stream().map(AdminDTO.SmallStockDTO::of).collect(Collectors.toSet());

        dto.setStocksDTOS(rslt);
        return dto;
    }
}
