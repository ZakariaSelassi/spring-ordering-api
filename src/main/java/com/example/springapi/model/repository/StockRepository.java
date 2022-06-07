package com.example.springapi.model.repository;

import com.example.springapi.model.entity.Stocks;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StockRepository extends JpaRepository<Stocks,Long> {
}
