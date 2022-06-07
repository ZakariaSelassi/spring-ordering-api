package com.example.springapi.mapper;

import com.example.springapi.model.dto.IngredientsDTO;
import com.example.springapi.model.entity.Customers;
import com.example.springapi.model.entity.Ingredients;
import org.springframework.stereotype.Service;

@Service
public class IngredientMapper {

    public IngredientsDTO convertToDTO(Ingredients ingredients){

        if(ingredients == null) return null;
        IngredientsDTO dto = new IngredientsDTO();

        dto.setName(ingredients.getName());
        dto.setDescription(ingredients.getDescription());
        IngredientsDTO.SmallStockDTO rslt = IngredientsDTO.SmallStockDTO.of(ingredients.getStocks());
        dto.setStock(rslt);

        return dto;
    }
}
