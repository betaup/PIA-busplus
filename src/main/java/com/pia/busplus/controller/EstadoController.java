package com.pia.busplus.controller;

import com.pia.busplus.model.Estado;
import com.pia.busplus.service.EstadoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/estados")
@CrossOrigin(origins = "*")
public class EstadoController {

    private final EstadoService service;

    public EstadoController(EstadoService service) {
        this.service = service;
    }

    @GetMapping
    public List<Estado> listar() {
        return service.listarTodos();
    }

    @GetMapping("/{id}")
    public Estado obtener(@PathVariable Integer id) {
        return service.buscarPorId(id).orElse(null);
    }

    @PostMapping
    public Estado crear(@RequestBody Estado estado) {
        return service.guardar(estado);
    }

    @PutMapping("/{id}")
    public Estado actualizar(@PathVariable Integer id, @RequestBody Estado estado) {
        estado.setId(id);
        return service.guardar(estado);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Integer id) {
        service.eliminar(id);
    }
}
