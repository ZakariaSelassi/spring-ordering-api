package com.example.springapi.model.dto;

import com.example.springapi.model.entity.Stocks;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.HashSet;
import java.util.Set;

@Data
@AllArgsConstructor
public class AdminDTO {
    private long idAdmin;
    private String username;
    private Set<StocksDTO> stocksDTOS;
}
