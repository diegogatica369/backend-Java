package com.example.demo.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.example.demo.model.License;
import com.example.demo.repository.LicenseRepository;

@Service
@Transactional  
public class LicenseService {

    private LicenseRepository licenseRepository;

    public LicenseService (LicenseRepository licenseRepository){
        this.licenseRepository = licenseRepository;
    }

    public void saveLicense (License license){
        licenseRepository.save(license);
    }

    public void updateLicense (License license){
        licenseRepository.save(license);
    }

    public void eliminarLicense (Integer id){
        licenseRepository.deleteById(id);
    }
    
    public List<License> findAll(){
        return licenseRepository.findAll();
    }

    public List<License> buscarPorClase (String clase){
        return licenseRepository.findAllLicenseClase(clase);
    }

    public List <License> buscarPorEstado (String estado){
        return licenseRepository.findAllLicenseEstado(estado);
    }

}
