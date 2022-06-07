package com.example.springapi.model.dto;

import com.example.springapi.model.entity.Orders;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.hibernate.criterion.Order;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@Data
@AllArgsConstructor
public  class CustomersDTO {
    private long idCustomer;
    private String lastname;
    private String firstname;
    private Set<SmallOrderDTO> orderDTOS;

    public CustomersDTO() {

    }

    @AllArgsConstructor
    @Data
    public static class SmallOrderDTO{
        private long idOrder;
        private LocalDate dateOrder;

        public static SmallOrderDTO of(Orders orders){
            return new SmallOrderDTO(orders.getIdOrder(),orders.getDateOrder());
        }
    }

}
