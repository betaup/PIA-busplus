package com.pia.busplus.service;

import com.pia.busplus.model.Ruta;
import com.pia.busplus.repository.RutaRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RutaService {

    private final RutaRepository rutaRepository;

    public RutaService(RutaRepository rutaRepository) {
        this.rutaRepository = rutaRepository;
    }

    public List<Ruta> obtenerTodas() {
        return rutaRepository.findAll();
    }

    public Optional<Ruta> obtenerPorId(Integer id) {
        return rutaRepository.findById(id);
    }

    public Ruta guardar(Ruta ruta) {
        return rutaRepository.save(ruta);
    }

    public void eliminar(Integer id) {
        rutaRepository.deleteById(id);
    }
}
