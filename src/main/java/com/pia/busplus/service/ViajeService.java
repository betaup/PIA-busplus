package com.pia.busplus.service;

import com.pia.busplus.model.Viaje;
import com.pia.busplus.repository.ViajeRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ViajeService {

    private final ViajeRepository viajeRepository;

    public ViajeService(ViajeRepository viajeRepository) {
        this.viajeRepository = viajeRepository;
    }

    public List<Viaje> obtenerTodos() {
        return viajeRepository.findAll();
    }

    public Optional<Viaje> obtenerPorId(Integer id) {
        return viajeRepository.findById(id);
    }

    public Viaje guardar(Viaje viaje) {
        return viajeRepository.save(viaje);
    }

    public void eliminar(Integer id) {
        viajeRepository.deleteById(id);
    }
}
