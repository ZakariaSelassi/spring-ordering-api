package com.example.springapi.model.dto;

import com.example.springapi.model.entity.Stocks;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.HashSet;
import java.util.Set;

@Data
@AllArgsConstructor
public class IngredientsDTO {

    private long idIngredient;
    private String name;
    private String description;

    private SmallStockDTO stock;

    public IngredientsDTO() {

    }

    @Data
    @AllArgsConstructor
    public static class SmallStockDTO{
        private long idStock;
        private int quantity;
        public static SmallStockDTO of(Stocks stocks){
            return new SmallStockDTO(stocks.getIdStocks(),stocks.getQuantity());
        }

    }

}
