package com.example.springapi.model.dto;

import com.example.springapi.model.entity.Stocks;

import java.util.HashSet;
import java.util.Set;

public class AdminDTO {
    private int id_admin;
    private String username;
    private Set<SmallStocksDTO> stocks;

    public static class  SmallStocksDTO{
        private int id_stock;
        private int quantity;
        public SmallStocksDTO(){}

        public SmallStocksDTO(int id_stock, int quantity) {
            this.id_stock = id_stock;
            this.quantity = quantity;
        }

        public static SmallStocksDTO of(Stocks stocks){
            return new SmallStocksDTO(stocks.getId_stock(), stocks.getQuantity());
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

    public AdminDTO(){}
    public AdminDTO(int id_admin, String username, Set<SmallStocksDTO> stocks) {
        this.id_admin = id_admin;
        this.username = username;
        this.stocks = stocks;
    }

    public int getId_admin() {
        return id_admin;
    }

    public void setId_admin(int id_admin) {
        this.id_admin = id_admin;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Set<SmallStocksDTO> getStocks() {
        return stocks;
    }

    public void setStocks(Set<SmallStocksDTO> stocks) {
        this.stocks = stocks;
    }
}
