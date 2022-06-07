package com.example.springapi.model.entity;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Menu {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_menu;
    private String menu_name;
    private double menu_amount;

    @ManyToMany
    @JoinTable(
            name="menu_orders",
            joinColumns = @JoinColumn(name="id_menu"),
            inverseJoinColumns = @JoinColumn(name="id_order")
    )

    private Set<Orders> orders = new HashSet<>();


    @ManyToMany(mappedBy = "menuList")
    private Set<Ingredients> ingredients = new HashSet<>();
    public Menu(){}

    public Menu(int id_menu, String menu_name, double menu_amount, Set<Orders> orders, Set<Ingredients> ingredients) {
        this.id_menu = id_menu;
        this.menu_name = menu_name;
        this.menu_amount = menu_amount;
        this.orders = orders;
        this.ingredients = ingredients;
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

    public Set<Orders> getOrders() {
        return orders;
    }

    public void setOrders(Set<Orders> orders) {
        this.orders = orders;
    }

    public Set<Ingredients> getIngredients() {
        return ingredients;
    }

    public void setIngredients(Set<Ingredients> ingredients) {
        this.ingredients = ingredients;
    }
}
