package com.example.springapi.model.entity;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Orders {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_order;

    private LocalDate dateTime;

    /**  mapping **/
    @ManyToOne
    @JoinColumn(name="customers_id",referencedColumnName = "id_customer") // change customer_id_customer to customers_id
    private Customers customers;


    @ManyToMany(mappedBy = "orders")
    private Set<Menu> menus = new HashSet<>();

    public Orders(){}

    public Orders(int id_order, LocalDate dateTime, Customers customers, Set<Menu> menus) {
        this.id_order = id_order;
        this.dateTime = dateTime;
        this.customers = customers;
        this.menus = menus;
    }

    public int getId_order() {
        return id_order;
    }

    public void setId_order(int id_order) {
        this.id_order = id_order;
    }

    public LocalDate getDateTime() {
        return dateTime;
    }

    public void setDateTime(LocalDate dateTime) {
        this.dateTime = dateTime;
    }

    public Customers getCustomers() {
        return customers;
    }

    public void setCustomers(Customers customers) {
        this.customers = customers;
    }

    public Set<Menu> getMenus() {
        return menus;
    }

    public void setMenus(Set<Menu> menus) {
        this.menus = menus;
    }
}
