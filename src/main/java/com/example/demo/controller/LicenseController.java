package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.License;
import com.example.demo.service.LicenseService;

@RestController
@CrossOrigin("*")
public class LicenseController {
    
    private LicenseService licenseService;

    public LicenseController (@Autowired LicenseService licenseService){
        this.licenseService = licenseService;
    }

    @PostMapping("/License/save")
    public void guardarLicencia (@RequestBody License license){
        licenseService.saveLicense(license);
    }

    @PutMapping("/License/update")
    public void actualizarLicencia (@RequestBody License license){
        licenseService.updateLicense(license);
    }

    @GetMapping("/License/findAll")
    public void todasLasLicense(){
        licenseService.findAll();
    }
    

    @GetMapping("/License/BuscarClase/{clase}")
    public List <License> BuscarClase (@PathVariable String clase){
        return licenseService.buscarPorClase(clase);
    }

    @GetMapping("/License/BuscarEstado/{estado}")
    public List <License> BuscarEstado (@PathVariable String estado){
        return licenseService.buscarPorEstado(estado);
    }

    @DeleteMapping("/Car/EliminarLicense/{id}")
    public void eliminarAuto (@PathVariable Integer id){
        licenseService.eliminarLicense(id);
    }
}
