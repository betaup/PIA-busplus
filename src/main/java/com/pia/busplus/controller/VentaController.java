package com.pia.busplus.controller;

import com.pia.busplus.model.Venta;
import com.pia.busplus.service.VentaService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/ventas")
@CrossOrigin(origins = "*")
public class VentaController {

    private final VentaService ventaService;

    public VentaController(VentaService ventaService) {
        this.ventaService = ventaService;
    }

    @GetMapping
    public List<Venta> listar() {
        return ventaService.obtenerTodas();
    }

    @GetMapping("/{id}")
    public Venta obtener(@PathVariable Integer id) {
        return ventaService.obtenerPorId(id).orElse(null);
    }

    @PostMapping
    public Venta crear(@RequestBody Venta venta) {
        return ventaService.guardar(venta);
    }

    @PutMapping("/{id}")
    public Venta actualizar(@PathVariable Integer id, @RequestBody Venta venta) {
        venta.setId(id);
        return ventaService.guardar(venta);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Integer id) {
        ventaService.eliminar(id);
    }
}
