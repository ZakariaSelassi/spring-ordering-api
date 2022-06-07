package com.example.springapi.model.dto;

public class StocksDTO {

    private int id_stock;

    private int quantity;

    public StocksDTO(){}

    public StocksDTO(int id_stock, int quantity) {
        this.id_stock = id_stock;
        this.quantity = quantity;
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
