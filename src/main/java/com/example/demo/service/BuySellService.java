package com.example.demo.service;

import java.util.Date;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.example.demo.model.BuySell;
import com.example.demo.repository.BuySellRepository;


@Service
@Transactional
public class BuySellService {
    
    private BuySellRepository buySellRepository;

    public BuySellService (BuySellRepository buySellRepository){
        this.buySellRepository = buySellRepository;
    }

    public void saveBuySell (BuySell buySell){
        buySellRepository.save(buySell);
    }

    public void updateBuySell (BuySell buySell){
        buySellRepository.save(buySell);
    }

    public void eliminarBuySell (Integer id){
        buySellRepository.deleteById(id);
    }

    public List<BuySell> findAll(){
        return buySellRepository.findAll();
    }

    public List<BuySell> buscarPorMonto (int monto){
        return buySellRepository.findAllBuySellMonto(monto);
    }

    public List <BuySell> buscarPorFechaCompra (Date fechaCompra){
        return buySellRepository.findAllBuySellFechaCompra(fechaCompra);
    }
}
