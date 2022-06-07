package com.example.springapi.model.dto;

import com.example.springapi.model.entity.Orders;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

public  class CustomersDTO {
    private int id_customer;
    private String first_name;
    private String last_name;
    private String phone;

    private Set<SmallOrderDTO> ordersDTO;

    public CustomersDTO(){}

    public CustomersDTO(int id_customer, String first_name, String last_name, String phone, Set<SmallOrderDTO> ordersDTO) {
        this.id_customer = id_customer;
        this.first_name = first_name;
        this.last_name = last_name;
        this.phone = phone;
        this.ordersDTO = ordersDTO;
    }

    public static class SmallOrderDTO{
        private int id_order;
        private LocalDate dateTime;
        public SmallOrderDTO(){

        }
        public SmallOrderDTO(int id_order, LocalDate dateTime) {
            this.id_order = id_order;
            this.dateTime = dateTime;
        }
        public static SmallOrderDTO of(Orders orders){
            return new SmallOrderDTO(orders.getId_order(),orders.getDateTime());
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
    }

    public int getId_customer() {
        return id_customer;
    }

    public void setId_customer(int id_customer) {
        this.id_customer = id_customer;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Set<SmallOrderDTO> getOrdersDTO() {
        return ordersDTO;
    }

    public void setOrdersDTO(Set<SmallOrderDTO> ordersDTO) {
        this.ordersDTO = ordersDTO;
    }
}
