package com.pia.busplus.service;

import com.pia.busplus.model.Conductor;
import com.pia.busplus.repository.ConductorRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ConductorService {

    private final ConductorRepository conductorRepository;

    public ConductorService(ConductorRepository conductorRepository) {
        this.conductorRepository = conductorRepository;
    }

    public List<Conductor> obtenerTodos() {
        return conductorRepository.findAll();
    }

    public Optional<Conductor> obtenerPorId(Integer id) {
        return conductorRepository.findById(id);
    }

    public Conductor guardar(Conductor conductor) {
        return conductorRepository.save(conductor);
    }

    public void eliminar(Integer id) {
        conductorRepository.deleteById(id);
    }
}
