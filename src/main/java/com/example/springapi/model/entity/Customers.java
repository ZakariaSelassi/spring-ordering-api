package com.example.springapi.model.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "customers")
public class Customers {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idCustomer;
    private String lastname;
    private String firstname;
    private String phone;
    private String email;

    @OneToMany(mappedBy = "customers")
    private Set<Orders> orders = new HashSet<>();

}
