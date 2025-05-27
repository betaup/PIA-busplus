package com.pia.busplus.controller;

import com.pia.busplus.model.Camion;
import com.pia.busplus.service.CamionService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/camiones")
@CrossOrigin(origins = "*")
public class CamionController {

    private final CamionService camionService;

    public CamionController(CamionService camionService) {
        this.camionService = camionService;
    }

    @GetMapping
    public List<Camion> listar() {
        return camionService.obtenerTodos();
    }

    @GetMapping("/{id}")
    public Camion obtener(@PathVariable Integer id) {
        return camionService.obtenerPorId(id).orElse(null);
    }

    @PostMapping
    public Camion crear(@RequestBody Camion camion) {
        return camionService.guardar(camion);
    }

    @PutMapping("/{id}")
    public Camion actualizar(@PathVariable Integer id, @RequestBody Camion camion) {
        camion.setId(id);
        return camionService.guardar(camion);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Integer id) {
        camionService.eliminar(id);
    }
}
