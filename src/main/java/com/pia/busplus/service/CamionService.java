package com.pia.busplus.service;

import com.pia.busplus.model.Camion;
import com.pia.busplus.repository.CamionRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CamionService {

    private final CamionRepository camionRepository;

    public CamionService(CamionRepository camionRepository) {
        this.camionRepository = camionRepository;
    }

    public List<Camion> obtenerTodos() {
        return camionRepository.findAll();
    }

    public Optional<Camion> obtenerPorId(Integer id) {
        return camionRepository.findById(id);
    }

    public Camion guardar(Camion camion) {
        return camionRepository.save(camion);
    }

    public void eliminar(Integer id) {
        camionRepository.deleteById(id);
    }
}
