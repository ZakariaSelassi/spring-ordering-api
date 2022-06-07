package com.example.springapi.model.dto;

import com.example.springapi.model.entity.Ingredients;

import java.util.HashSet;
import java.util.Set;

public class MenuDTO {
    private int id_menu;
    private String menu_name;
    private double menu_amount;
    private Set<SmallIngredientsDTO> ingredients;

    public MenuDTO(){}

    public static class SmallIngredientsDTO{
        private int id_ingredient;
        private String name_ingredient;
        private String desc_ingredient;
        public SmallIngredientsDTO(){}

        public SmallIngredientsDTO(int id_ingredient, String name_ingredient, String desc_ingredient) {
            this.id_ingredient = id_ingredient;
            this.name_ingredient = name_ingredient;
            this.desc_ingredient = desc_ingredient;
        }

        public static SmallIngredientsDTO of(Ingredients ingredients){
            return new SmallIngredientsDTO(ingredients.getId_ingredient(),ingredients.getName_ingredient(), ingredients.getDesc_ingredient());
        }
        public int getId_ingredient() {
            return id_ingredient;
        }

        public void setId_ingredient(int id_ingredient) {
            this.id_ingredient = id_ingredient;
        }

        public String getName_ingredient() {
            return name_ingredient;
        }

        public void setName_ingredient(String name_ingredient) {
            this.name_ingredient = name_ingredient;
        }

        public String getDesc_ingredient() {
            return desc_ingredient;
        }

        public void setDesc_ingredient(String desc_ingredient) {
            this.desc_ingredient = desc_ingredient;
        }
    }

    public int getId_menu() {
        return id_menu;
    }

    public void setId_menu(int id_menu) {
        this.id_menu = id_menu;
    }

    public String getMenu_name() {
        return menu_name;
    }

    public void setMenu_name(String menu_name) {
        this.menu_name = menu_name;
    }

    public double getMenu_amount() {
        return menu_amount;
    }

    public void setMenu_amount(double menu_amount) {
        this.menu_amount = menu_amount;
    }

    public Set<SmallIngredientsDTO> getIngredients() {
        return ingredients;
    }

    public void setIngredients(Set<SmallIngredientsDTO> ingredients) {
        this.ingredients = ingredients;
    }
}
