package com.example.springapi.mapper;

import com.example.springapi.model.dto.IngredientsDTO;
import com.example.springapi.model.dto.MenuDTO;
import com.example.springapi.model.entity.Menu;
import org.springframework.stereotype.Service;

import java.util.Set;
import java.util.stream.Collectors;

@Service
public class MenuMapper {

    public MenuDTO convertToDTO(Menu menu){
        if(menu == null)return null;

        MenuDTO dto = new MenuDTO();
        dto.setNameMenu(menu.getNameMenu());
        dto.setAmount(menu.getAmount());
        Set<MenuDTO.SmallIngredientsDTO> rslt = menu.getIngredients().stream()
                        .map(MenuDTO.SmallIngredientsDTO::of).collect(Collectors.toSet());
        dto.setIngredients(rslt);
        return dto;
    }
}
