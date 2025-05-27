package com.pia.busplus.service;

import com.pia.busplus.model.Estado;
import com.pia.busplus.repository.EstadoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EstadoService {

    private final EstadoRepository repository;

    public EstadoService(EstadoRepository repository) {
        this.repository = repository;
    }

    public List<Estado> listarTodos() {
        return repository.findAll();
    }

    public Optional<Estado> buscarPorId(Integer id) {
        return repository.findById(id);
    }

    public Estado guardar(Estado estado) {
        return repository.save(estado);
    }

    public void eliminar(Integer id) {
        repository.deleteById(id);
    }
}
