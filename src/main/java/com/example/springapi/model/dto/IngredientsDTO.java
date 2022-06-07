package com.example.springapi.model.dto;

import com.example.springapi.model.entity.Stocks;

import java.util.HashSet;
import java.util.Set;

public class IngredientsDTO {

    private int id_ingredient;
    private String name_ingredient;
    private String desc_ingredient;

    private SmallStockDTO stock;

    public IngredientsDTO(){}

    public IngredientsDTO(int id_ingredient, String name_ingredient, String desc_ingredient, SmallStockDTO stock) {
        this.id_ingredient = id_ingredient;
        this.name_ingredient = name_ingredient;
        this.desc_ingredient = desc_ingredient;
        this.stock = stock;
    }

    public static class SmallStockDTO{
        private int id_stock;
        private int quantity;

        public SmallStockDTO(){}

        public SmallStockDTO(int id_stock, int quantity) {
            this.id_stock = id_stock;
            this.quantity = quantity;
        }

        public static SmallStockDTO of(Stocks stocks){
            return new SmallStockDTO(stocks.getId_stock(), stocks.getQuantity());
        }
        public int getId_stock() {
            return id_stock;
        }

        public void setId_stock(int id_stock) {
            this.id_stock = id_stock;
        }

        public int getQuantity() {
            return quantity;
        }

        public void setQuantity(int quantity) {
            this.quantity = quantity;
        }
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

    public SmallStockDTO getStock() {
        return stock;
    }

    public void setStock(SmallStockDTO stock) {
        this.stock = stock;
    }
}
