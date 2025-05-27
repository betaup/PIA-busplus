package com.pia.busplus.controller;

import com.pia.busplus.model.Empresa;
import com.pia.busplus.service.EmpresaService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/empresas")
@CrossOrigin(origins = "*")
public class EmpresaController {

    private final EmpresaService empresaService;

    public EmpresaController(EmpresaService empresaService) {
        this.empresaService = empresaService;
    }

    @GetMapping
    public List<Empresa> listar() {
        return empresaService.obtenerTodas();
    }

    @GetMapping("/{id}")
    public Empresa obtener(@PathVariable Integer id) {
        return empresaService.obtenerPorId(id).orElse(null);
    }

    @PostMapping
    public Empresa crear(@RequestBody Empresa empresa) {
        return empresaService.guardar(empresa);
    }

    @PutMapping("/{id}")
    public Empresa actualizar(@PathVariable Integer id, @RequestBody Empresa empresa) {
        empresa.setId(id);
        return empresaService.guardar(empresa);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Integer id) {
        empresaService.eliminar(id);
    }
}
