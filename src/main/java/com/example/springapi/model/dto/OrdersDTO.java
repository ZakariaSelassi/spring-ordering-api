package com.example.springapi.model.dto;

import com.example.springapi.model.entity.Menu;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@Data
@AllArgsConstructor
public class OrdersDTO {
    private long idOrder;
    private LocalDate dateOrder;
    private Set<SmallMenuDTO> menus;

    public OrdersDTO() {

    }

    @Data
    @AllArgsConstructor
    public static class SmallMenuDTO{
       private long idMenu;
       private String nameMenu;
       private double amount;

        public static SmallMenuDTO of(Menu menu){
            return  new SmallMenuDTO(menu.getIdMenu(), menu.getNameMenu(), menu.getAmount());
        }


    }


}
