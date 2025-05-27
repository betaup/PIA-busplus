package com.pia.busplus.controller;

import com.pia.busplus.model.Conductor;
import com.pia.busplus.service.ConductorService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/conductores")
@CrossOrigin(origins = "*")
public class ConductorController {

    private final ConductorService conductorService;

    public ConductorController(ConductorService conductorService) {
        this.conductorService = conductorService;
    }

    @GetMapping
    public List<Conductor> listar() {
        return conductorService.obtenerTodos();
    }

    @GetMapping("/{id}")
    public Conductor obtener(@PathVariable Integer id) {
        return conductorService.obtenerPorId(id).orElse(null);
    }

    @PostMapping
    public Conductor crear(@RequestBody Conductor conductor) {
        return conductorService.guardar(conductor);
    }

    @PutMapping("/{id}")
    public Conductor actualizar(@PathVariable Integer id, @RequestBody Conductor conductor) {
        conductor.setId(id);
        return conductorService.guardar(conductor);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Integer id) {
        conductorService.eliminar(id);
    }
}
