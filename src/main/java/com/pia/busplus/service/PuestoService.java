package com.pia.busplus.service;

import com.pia.busplus.model.Puesto;
import com.pia.busplus.repository.PuestoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PuestoService {

    private final PuestoRepository puestoRepository;

    public PuestoService(PuestoRepository puestoRepository) {
        this.puestoRepository = puestoRepository;
    }

    public List<Puesto> obtenerTodos() {
        return puestoRepository.findAll();
    }

    public Optional<Puesto> obtenerPorId(Integer id) {
        return puestoRepository.findById(id);
    }

    public Puesto guardar(Puesto puesto) {
        return puestoRepository.save(puesto);
    }

    public void eliminar(Integer id) {
        puestoRepository.deleteById(id);
    }
}
