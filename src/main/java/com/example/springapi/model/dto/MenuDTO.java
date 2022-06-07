package com.example.springapi.model.dto;

import com.example.springapi.model.entity.Ingredients;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.HashSet;
import java.util.Set;

@Data
@AllArgsConstructor
public class MenuDTO {
    private long idMenu;

    private String nameMenu;
    private double amount;
    private Set<SmallIngredientsDTO> ingredients;

    public MenuDTO() {

    }

    @Data
    @AllArgsConstructor
    public static class SmallIngredientsDTO{
        private long idIngredient;
        private String name;
        private String description;

        public static SmallIngredientsDTO of(Ingredients ingredients){
            return new SmallIngredientsDTO(ingredients.getIdIngredient(),
                    ingredients.getName(),
                    ingredients.getDescription());
        }

    }


}
