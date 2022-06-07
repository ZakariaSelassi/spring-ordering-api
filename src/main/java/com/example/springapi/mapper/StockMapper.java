package com.example.springapi.mapper;

import com.example.springapi.model.dto.StocksDTO;
import com.example.springapi.model.entity.Stocks;
import org.springframework.stereotype.Service;

@Service
public class StockMapper {

    public StocksDTO convertToDTO(Stocks stock){
        if(stock == null) return null;

        StocksDTO dto = new StocksDTO();

        dto.setQuantity(stock.getQuantity());

        return dto;
    }
}
