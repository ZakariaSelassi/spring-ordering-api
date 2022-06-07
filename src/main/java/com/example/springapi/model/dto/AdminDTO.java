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
    private Set<SmallStockDTO> stocksDTOS;

    public AdminDTO() {

    }

    @Data
    @AllArgsConstructor
    public static class SmallStockDTO{
        private long idStock;
        private int quantity;
        public static AdminDTO.SmallStockDTO of(Stocks stocks){
            return new AdminDTO.SmallStockDTO(stocks.getIdStocks(),stocks.getQuantity());
        }
    }
}
