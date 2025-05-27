package com.pia.busplus.service;

import com.pia.busplus.model.Terminal;
import com.pia.busplus.repository.TerminalRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TerminalService {

    private final TerminalRepository terminalRepository;

    public TerminalService(TerminalRepository terminalRepository) {
        this.terminalRepository = terminalRepository;
    }

    public List<Terminal> obtenerTodos() {
        return terminalRepository.findAll();
    }

    public Optional<Terminal> obtenerPorId(Integer id) {
        return terminalRepository.findById(id);
    }

    public Terminal guardar(Terminal terminal) {
        return terminalRepository.save(terminal);
    }

    public void eliminar(Integer id) {
        terminalRepository.deleteById(id);
    }
}
