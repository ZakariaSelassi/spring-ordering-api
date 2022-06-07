package com.example.springapi.model.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "menu")

public class Menu {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idMenu;

    private String nameMenu;
    private double amount;
    @ManyToMany
    @JoinTable(
            name = "menu_orders",
            joinColumns = @JoinColumn(name="idMenu"),
            inverseJoinColumns = @JoinColumn(name="idOrder")
    )
    private Set<Orders> ordersList = new HashSet<>();

    @ManyToMany(mappedBy = "menuList")
    private Set<Ingredients> ingredients = new HashSet<>();

}
