package com.pia.busplus.controller;

import com.pia.busplus.model.Asiento;
import com.pia.busplus.service.AsientoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/asientos")
@CrossOrigin(origins = "*")
public class AsientoController {

    private final AsientoService asientoService;

    public AsientoController(AsientoService asientoService) {
        this.asientoService = asientoService;
    }

    @GetMapping
    public List<Asiento> listar() {
        return asientoService.obtenerTodos();
    }

    @GetMapping("/{id}")
    public Asiento obtener(@PathVariable Integer id) {
        return asientoService.obtenerPorId(id).orElse(null);
    }

    @PostMapping
    public Asiento crear(@RequestBody Asiento asiento) {
        return asientoService.guardar(asiento);
    }

    @PutMapping("/{id}")
    public Asiento actualizar(@PathVariable Integer id, @RequestBody Asiento asiento) {
        asiento.setId(id);
        return asientoService.guardar(asiento);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Integer id) {
        asientoService.eliminar(id);
    }
}
