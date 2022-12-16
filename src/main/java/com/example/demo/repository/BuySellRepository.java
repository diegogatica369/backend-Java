package com.example.demo.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.model.BuySell;

public interface BuySellRepository extends JpaRepository<BuySell, Integer> {

    @Query(value="SELECT * FROM buy_sell WHERE monto =?1", nativeQuery = true)
    List <BuySell> findAllBuySellMonto (int monto);
    
    @Query(value="SELECT * FROM buy_sell WHERE fechaCompra =?1", nativeQuery = true)
    List <BuySell> findAllBuySellFechaCompra (Date fechaCompra); 


}
