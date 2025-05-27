package com.pia.busplus.service;

import com.pia.busplus.model.TipoBoleto;
import com.pia.busplus.repository.TipoBoletoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TipoBoletoService {

    private final TipoBoletoRepository tipoBoletoRepository;

    public TipoBoletoService(TipoBoletoRepository tipoBoletoRepository) {
        this.tipoBoletoRepository = tipoBoletoRepository;
    }

    public List<TipoBoleto> obtenerTodos() {
        return tipoBoletoRepository.findAll();
    }

    public Optional<TipoBoleto> obtenerPorId(Integer id) {
        return tipoBoletoRepository.findById(id);
    }

    public TipoBoleto guardar(TipoBoleto tipoBoleto) {
        return tipoBoletoRepository.save(tipoBoleto);
    }

    public void eliminar(Integer id) {
        tipoBoletoRepository.deleteById(id);
    }
}

