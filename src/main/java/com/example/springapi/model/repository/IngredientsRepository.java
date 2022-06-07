package com.example.springapi.model.repository;

import com.example.springapi.model.entity.Ingredients;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IngredientsRepository extends JpaRepository<Ingredients,Integer> {
}
