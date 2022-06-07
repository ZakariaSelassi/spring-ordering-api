package com.example.springapi.model.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "stocks")

public class Stocks {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idStocks;
    private int quantity;

    @OneToOne(mappedBy = "stocks")
    private Ingredients ingred;

    @ManyToOne
    @JoinColumn(name="idAdmin",referencedColumnName = "idAdmin")
    private Admin admin;

}
