package com.example.demo.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.BuySell;
import com.example.demo.service.BuySellService;

@RestController
@CrossOrigin("*")
public class BuySellController {
    
    private BuySellService buysSellService;

    public BuySellController (@Autowired BuySellService buySellService){
        this.buysSellService = buySellService;
    }

    @PostMapping("/BuySell/Save")
    public void guardarBuySell (@RequestBody BuySell buySell){
        buysSellService.saveBuySell(buySell);
    }

    @PutMapping("/BuySell/update")
    public void actualizarBuySell (@RequestBody BuySell buySell){
        buysSellService.updateBuySell(buySell);
    }

    @GetMapping("/BuySell/findAll")
    public void todasLasBuySell(){
        buysSellService.findAll();
    }

    @GetMapping("/BuySell/BuscarMonto/{monto}")
    public List <BuySell> BuscarClase (@PathVariable int monto){
        return buysSellService.buscarPorMonto(monto);
    }

    @GetMapping("/BuySell/BuscarFechaCompra/{fechaCompra}")
    public List <BuySell> BuscarFechaCompra (@PathVariable Date fechaCompra){
        return buysSellService.buscarPorFechaCompra(fechaCompra);
    }

}
