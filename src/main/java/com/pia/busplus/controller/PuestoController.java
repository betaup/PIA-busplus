package com.pia.busplus.controller;

import com.pia.busplus.model.Puesto;
import com.pia.busplus.service.PuestoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/puestos")
@CrossOrigin(origins = "*")
public class PuestoController {

    private final PuestoService puestoService;

    public PuestoController(PuestoService puestoService) {
        this.puestoService = puestoService;
    }

    @GetMapping
    public List<Puesto> listar() {
        return puestoService.obtenerTodos();
    }

    @GetMapping("/{id}")
    public Puesto obtener(@PathVariable Integer id) {
        return puestoService.obtenerPorId(id).orElse(null);
    }

    @PostMapping
    public Puesto crear(@RequestBody Puesto puesto) {
        return puestoService.guardar(puesto);
    }

    @PutMapping("/{id}")
    public Puesto actualizar(@PathVariable Integer id, @RequestBody Puesto puesto) {
        puesto.setId(id);
        return puestoService.guardar(puesto);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Integer id) {
        puestoService.eliminar(id);
    }
}
