package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.model.Car;

public interface CarRepository extends JpaRepository<Car, Integer> {

    @Query(value= "SELECT * FROM car WHERE marca = ?1", nativeQuery = true)
    List<Car> findAllCarMarca (String marca);

    @Query(value= "SELECT * FROM car WHERE color = ?1", nativeQuery = true)
    List<Car> findAllCarColor (String color);

    @Query(value= "SELECT * FROM car WHERE color = ?1 AND marca = ?2", nativeQuery = true)
    List<Car> findAllCarColorMarca (String color, String marca);

    @Query(value= "SELECT * FROM car c JOIN c.car_sell cs", nativeQuery = true)
    List<Car> buscarAutosVendidos();
}
