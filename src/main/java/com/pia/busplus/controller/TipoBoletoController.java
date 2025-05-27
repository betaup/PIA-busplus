package com.pia.busplus.controller;

import com.pia.busplus.model.TipoBoleto;
import com.pia.busplus.service.TipoBoletoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/tipos-boletos")
@CrossOrigin(origins = "*")
public class TipoBoletoController {

    private final TipoBoletoService tipoBoletoService;

    public TipoBoletoController(TipoBoletoService tipoBoletoService) {
        this.tipoBoletoService = tipoBoletoService;
    }

    @GetMapping
    public List<TipoBoleto> listar() {
        return tipoBoletoService.obtenerTodos();
    }

    @GetMapping("/{id}")
    public TipoBoleto obtener(@PathVariable Integer id) {
        return tipoBoletoService.obtenerPorId(id).orElse(null);
    }

    @PostMapping
    public TipoBoleto crear(@RequestBody TipoBoleto tipoBoleto) {
        return tipoBoletoService.guardar(tipoBoleto);
    }

    @PutMapping("/{id}")
    public TipoBoleto actualizar(@PathVariable Integer id, @RequestBody TipoBoleto tipoBoleto) {
        tipoBoleto.setId(id);
        return tipoBoletoService.guardar(tipoBoleto);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Integer id) {
        tipoBoletoService.eliminar(id);
    }
}
