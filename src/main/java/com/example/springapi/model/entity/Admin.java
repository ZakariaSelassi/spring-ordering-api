package com.example.springapi.model.entity;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Admin {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_admin;
    private String username;
    private String password;
    private boolean isAdmin;

    @OneToMany(mappedBy = "admin")
    private Set<Stocks> stocksList = new HashSet<>();


    public Admin(){}

    public Admin(int id_admin, String username, String password, boolean isAdmin, Set<Stocks> stocksList) {
        this.id_admin = id_admin;
        this.username = username;
        this.password = password;
        this.isAdmin = isAdmin;
        this.stocksList = stocksList;
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isAdmin() {
        return isAdmin;
    }

    public void setAdmin(boolean admin) {
        isAdmin = admin;
    }

    public Set<Stocks> getStocksList() {
        return stocksList;
    }

    public void setStocksList(Set<Stocks> stocksList) {
        this.stocksList = stocksList;
    }
}
