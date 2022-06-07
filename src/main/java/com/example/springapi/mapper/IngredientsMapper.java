package com.example.springapi.mapper;

import com.example.springapi.model.dto.IngredientsDTO;
import com.example.springapi.model.entity.Ingredients;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class IngredientsMapper {


    public IngredientsDTO convertToDTO(Ingredients ingredients){
        if(ingredients == null)return null;

        IngredientsDTO dto = new IngredientsDTO();
        dto.setId_ingredient(ingredients.getId_ingredient());
        dto.setName_ingredient(ingredients.getName_ingredient());
        dto.setDesc_ingredient(ingredients.getDesc_ingredient());
        IngredientsDTO.SmallStockDTO rslt = IngredientsDTO.SmallStockDTO.of(ingredients.getStocks());
        dto.setStock(rslt);
        return dto;
    }
}
