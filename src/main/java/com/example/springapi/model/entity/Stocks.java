package com.example.springapi.model.entity;

import javax.persistence.*;

@Entity
public class Stocks {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_stock;

    private int quantity;

    @OneToOne(mappedBy = "stocks")
    private Ingredients ingred;

    @ManyToOne
    @JoinColumn(name="id_admin", referencedColumnName = "id_admin")
    private Admin admin;

    public Stocks(){}

    public Stocks(int id_stock, int quantity, Ingredients ingred, Admin admin) {
        this.id_stock = id_stock;
        this.quantity = quantity;
        this.ingred = ingred;
        this.admin = admin;
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

    public Ingredients getIngred() {
        return ingred;
    }

    public void setIngred(Ingredients ingred) {
        this.ingred = ingred;
    }

    public Admin getAdmin() {
        return admin;
    }

    public void setAdmin(Admin admin) {
        this.admin = admin;
    }
}
