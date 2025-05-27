package com.pia.busplus.service;

import com.pia.busplus.model.Asiento;
import com.pia.busplus.repository.AsientoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AsientoService {

    private final AsientoRepository asientoRepository;

    public AsientoService(AsientoRepository asientoRepository) {
        this.asientoRepository = asientoRepository;
    }

    public List<Asiento> obtenerTodos() {
        return asientoRepository.findAll();
    }

    public Optional<Asiento> obtenerPorId(Integer id) {
        return asientoRepository.findById(id);
    }

    public Asiento guardar(Asiento asiento) {
        return asientoRepository.save(asiento);
    }

    public void eliminar(Integer id) {
        asientoRepository.deleteById(id);
    }
}
