package com.example.springapi.model.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "orders")

public class Orders {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idOrder;
    private LocalDate dateOrder;

    @ManyToOne
    @JoinColumn(name = "customers_id",referencedColumnName = "idCustomer")
    private Customers customers;

    @ManyToMany(mappedBy = "ordersList")
    private Set<Menu> menus = new HashSet<>();

}
