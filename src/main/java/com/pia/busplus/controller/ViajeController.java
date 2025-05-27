package com.pia.busplus.controller;

import com.pia.busplus.model.Viaje;
import com.pia.busplus.service.ViajeService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/viajes")
@CrossOrigin(origins = "*")
public class ViajeController {

    private final ViajeService viajeService;

    public ViajeController(ViajeService viajeService) {
        this.viajeService = viajeService;
    }

    @GetMapping
    public List<Viaje> listar() {
        return viajeService.obtenerTodos();
    }

    @GetMapping("/{id}")
    public Viaje obtener(@PathVariable Integer id) {
        return viajeService.obtenerPorId(id).orElse(null);
    }

    @PostMapping
    public Viaje crear(@RequestBody Viaje viaje) {
        return viajeService.guardar(viaje);
    }

    @PutMapping("/{id}")
    public Viaje actualizar(@PathVariable Integer id, @RequestBody Viaje viaje) {
        viaje.setId(id);
        return viajeService.guardar(viaje);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Integer id) {
        viajeService.eliminar(id);
    }
}
