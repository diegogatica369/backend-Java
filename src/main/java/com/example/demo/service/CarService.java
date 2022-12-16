package com.example.demo.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.example.demo.model.Car;
import com.example.demo.repository.CarRepository;

@Service
@Transactional
public class CarService {

    private CarRepository carRepository;
    
    public CarService (CarRepository carRepository){
        this.carRepository = carRepository;
    }

    public void saveCar (Car car){
        carRepository.save(car);
    }

    public void updateCar (Car car){
        carRepository.save(car);
    }

    public List<Car> findAll(){
        return carRepository.findAll();
    }

    public List<Car> buscarPorMarca(String marca){
        return carRepository.findAllCarMarca(marca);
    }

    public List<Car> buscarPorColor(String color){
        return carRepository.findAllCarColor(color);
    }

    public List<Car> buscarPorMarcaColor(String marca, String color){
        return carRepository.findAllCarColorMarca(marca, color);
    }

    public void eliminarCar (Integer id){
        carRepository.deleteById(id);
    }
}
