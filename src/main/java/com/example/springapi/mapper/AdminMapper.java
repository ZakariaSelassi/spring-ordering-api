package com.example.springapi.mapper;

import com.example.springapi.model.dto.AdminDTO;
import com.example.springapi.model.entity.Admin;
import org.springframework.stereotype.Service;

import java.util.Set;
import java.util.stream.Collectors;

@Service
public class AdminMapper {

    public AdminDTO convertToDTO(Admin admin){
        if(admin == null)return null;
        AdminDTO dto = new AdminDTO();
        dto.setId_admin(admin.getId_admin());
        dto.setUsername(admin.getUsername());


        Set<AdminDTO.SmallStocksDTO> rslt = admin.getStocksList()
                        .stream().map(AdminDTO.SmallStocksDTO::of)
                        .collect(Collectors.toSet());
        dto.setStocks(rslt);
        return dto;
    }
}
