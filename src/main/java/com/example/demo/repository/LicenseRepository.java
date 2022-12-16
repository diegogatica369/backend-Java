package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.model.License;

public interface LicenseRepository extends JpaRepository<License, Integer> {
    
    @Query(value= "SELECT * FROM license WHERE clase = ?1", nativeQuery = true)
    List<License> findAllLicenseClase (String clase);

    @Query(value= "SELECT * FROM license WHERE estado = ?1", nativeQuery = true)
    List<License> findAllLicenseEstado (String estado);

    @Query(value= "SELECT * FROM license WHERE numero = ?1", nativeQuery = true)
    List<License> findAllLicenseNumero (int Numero);

}