package com.soporte.soportetecnicoapi.controller;

import com.soporte.soportetecnicoapi.model.Solicitud;
import com.soporte.soportetecnicoapi.service.ISolicitudService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/solicitudes")
public class SolicitudController {

    @Autowired
    private ISolicitudService solicitudService;

    @GetMapping
    public List<Solicitud> listar() {
        return solicitudService.listar();
    }

    @GetMapping("/{id}")
    public Solicitud buscarPorId(@PathVariable Long id) {
        return solicitudService.buscarPorId(id);
    }

    @PostMapping
    public Solicitud guardar(@Valid @RequestBody Solicitud solicitud) {
        return solicitudService.guardar(solicitud);
    }

    @PutMapping("/{id}")
    public Solicitud actualizar(@PathVariable Long id,
                                @Valid @RequestBody Solicitud solicitud) {
        return solicitudService.actualizar(id, solicitud);
    }

    @DeleteMapping("/{id}")
    public String eliminar(@PathVariable Long id) {
        solicitudService.eliminar(id);
        return "Solicitud eliminada correctamente";
    }
}