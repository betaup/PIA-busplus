package com.pia.busplus.controller;

import com.pia.busplus.model.Ruta;
import com.pia.busplus.service.RutaService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/rutas")
@CrossOrigin(origins = "*")
public class RutaController {

    private final RutaService rutaService;

    public RutaController(RutaService rutaService) {
        this.rutaService = rutaService;
    }

    @GetMapping
    public List<Ruta> listar() {
        return rutaService.obtenerTodas();
    }

    @GetMapping("/{id}")
    public Ruta obtener(@PathVariable Integer id) {
        return rutaService.obtenerPorId(id).orElse(null);
    }

    @PostMapping
    public Ruta crear(@RequestBody Ruta ruta) {
        return rutaService.guardar(ruta);
    }

    @PutMapping("/{id}")
    public Ruta actualizar(@PathVariable Integer id, @RequestBody Ruta ruta) {
        ruta.setId(id);
        return rutaService.guardar(ruta);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Integer id) {
        rutaService.eliminar(id);
    }
}
