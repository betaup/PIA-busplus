package com.pia.busplus.controller;

import com.pia.busplus.model.Terminal;
import com.pia.busplus.service.TerminalService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/terminales")
@CrossOrigin(origins = "*")
public class TerminalController {

    private final TerminalService terminalService;

    public TerminalController(TerminalService terminalService) {
        this.terminalService = terminalService;
    }

    @GetMapping
    public List<Terminal> listar() {
        return terminalService.obtenerTodos();
    }

    @GetMapping("/{id}")
    public Terminal obtener(@PathVariable Integer id) {
        return terminalService.obtenerPorId(id).orElse(null);
    }

    @PostMapping
    public Terminal crear(@RequestBody Terminal terminal) {
        return terminalService.guardar(terminal);
    }

    @PutMapping("/{id}")
    public Terminal actualizar(@PathVariable Integer id, @RequestBody Terminal terminal) {
        terminal.setId(id);
        return terminalService.guardar(terminal);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Integer id) {
        terminalService.eliminar(id);
    }
}
