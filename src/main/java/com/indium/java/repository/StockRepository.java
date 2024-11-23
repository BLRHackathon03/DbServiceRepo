package com.indium.java.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.indium.java.entity.Stock;

public interface StockRepository extends JpaRepository<Stock, Long>{
}

