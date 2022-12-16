package com.example.demo.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.example.demo.model.CarSell;
import com.example.demo.repository.CarSellRepository;

@Service
@Transactional
public class CarSellService {

    private CarSellRepository carSellRepository;

    public CarSellService (CarSellRepository carSellRepository){
        this.carSellRepository = carSellRepository;
    }

    public void saveCarSell (CarSell carSell){
        carSellRepository.save(carSell);
    }
    
    public void updateCarSell (CarSell carSell){
        carSellRepository.save(carSell);
    }

    public void eliminarCarSell (Integer id){
        carSellRepository.deleteById(id);
    }

    public List <CarSell> findAll(){
        return carSellRepository.findAll();
    }

    public List <CarSell> buscarPorCantidad (int cantidad){
        return carSellRepository.findAllCarSellCantidad(cantidad);
    }
}
