package com.pia.busplus.controller;

import com.pia.busplus.model.Servicio;
import com.pia.busplus.service.ServicioService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/servicios")
@CrossOrigin(origins = "*")
public class ServicioController {

    private final ServicioService servicioService;

    public ServicioController(ServicioService servicioService) {
        this.servicioService = servicioService;
    }

    @GetMapping
    public List<Servicio> listar() {
        return servicioService.obtenerTodos();
    }

    @GetMapping("/{id}")
    public Servicio obtener(@PathVariable Integer id) {
        return servicioService.obtenerPorId(id).orElse(null);
    }

    @PostMapping
    public Servicio crear(@RequestBody Servicio servicio) {
        return servicioService.guardar(servicio);
    }

    @PutMapping("/{id}")
    public Servicio actualizar(@PathVariable Integer id, @RequestBody Servicio servicio) {
        servicio.setId(id);
        return servicioService.guardar(servicio);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Integer id) {
        servicioService.eliminar(id);
    }
}
