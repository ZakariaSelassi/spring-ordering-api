package com.example.springapi.model.dto;

import com.example.springapi.model.entity.Menu;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

public class OrdersDTO {
    private int id_order;
    private LocalDate dateTime;

    private Set<SmallMenuDTO> menus;

    public OrdersDTO(){}

    public static class SmallMenuDTO{
        private int id_menu;
        private String menu_name;
        private double menu_amount;

        public SmallMenuDTO(){}

        public SmallMenuDTO(int id_menu, String menu_name, double menu_amount) {
            this.id_menu = id_menu;
            this.menu_name = menu_name;
            this.menu_amount = menu_amount;
        }

        public static SmallMenuDTO of(Menu menu){
            return new SmallMenuDTO(menu.getId_menu(),menu.getMenu_name(),menu.getMenu_amount());
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
    }

    public OrdersDTO(int id_order, LocalDate dateTime, Set<SmallMenuDTO> menus) {
        this.id_order = id_order;
        this.dateTime = dateTime;

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

    public Set<SmallMenuDTO> getMenus() {
        return menus;
    }

    public void setMenus(Set<SmallMenuDTO> menus) {
        this.menus = menus;
    }
}
