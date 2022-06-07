package com.example.springapi.model.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "ingredients")

public class Ingredients {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idIngredient;
    private String name;
    private String description;

    @ManyToMany
    @JoinTable(
            name = "ingredients_menu",
            joinColumns = @JoinColumn(name = "idIngredient"),
            inverseJoinColumns = @JoinColumn(name="idMenu")
    )
    private Set<Menu> menuList = new HashSet<>();

    @OneToOne
    @JoinColumn(name = "idStock",referencedColumnName = "idStocks")
    private Stocks stocks;

}
