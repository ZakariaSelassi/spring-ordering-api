package com.example.springapi.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class StocksDTO {
    private long idStocks;
    private int quantity;

    public StocksDTO() {

    }
}
