package com.example.springapi.model.entity;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;


@Entity
public class Ingredients {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_ingredient;
    private String name_ingredient;
    private String desc_ingredient;


    @ManyToMany
    @JoinTable(
            name="ingredient_menu",
            joinColumns = @JoinColumn(name = "id_ingredient"),
            inverseJoinColumns = @JoinColumn(name="id_menu")
    )
    private Set<Menu> menuList = new HashSet<>();


    @OneToOne
    @JoinColumn(name = "id_stock",referencedColumnName = "id_stock")
    private Stocks stocks;



    public Ingredients(){}

    public Ingredients(int id_ingredient, String name_ingredient, String desc_ingredient, Set<Menu> menuList, Stocks stocks) {
        this.id_ingredient = id_ingredient;
        this.name_ingredient = name_ingredient;
        this.desc_ingredient = desc_ingredient;
        this.menuList = menuList;
        this.stocks = stocks;
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

    public Set<Menu> getMenuList() {
        return menuList;
    }

    public void setMenuList(Set<Menu> menuList) {
        this.menuList = menuList;
    }

    public Stocks getStocks() {
        return stocks;
    }

    public void setStocks(Stocks stocks) {
        this.stocks = stocks;
    }
}
