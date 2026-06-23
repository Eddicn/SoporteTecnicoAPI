package com.soporte.soportetecnicoapi.service;

import com.soporte.soportetecnicoapi.model.Solicitud;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SolicitudService implements ISolicitudService {

    private final List<Solicitud> solicitudes = new ArrayList<>();

    @Override
    public List<Solicitud> listar() {
        return solicitudes;
    }

    @Override
    public Solicitud buscarPorId(Long id) {
        for (Solicitud solicitud : solicitudes) {
            if (solicitud.getId().equals(id)) {
                return solicitud;
            }
        }
        return null;
    }

    @Override
    public Solicitud guardar(Solicitud solicitud) {
        solicitudes.add(solicitud);
        return solicitud;
    }

    @Override
    public Solicitud actualizar(Long id, Solicitud solicitudActualizada) {

        Solicitud solicitud = buscarPorId(id);

        if (solicitud != null) {
            solicitud.setTitulo(solicitudActualizada.getTitulo());
            solicitud.setDescripcion(solicitudActualizada.getDescripcion());
            solicitud.setEstado(solicitudActualizada.getEstado());
            solicitud.setClienteId(solicitudActualizada.getClienteId());
            solicitud.setTecnicoId(solicitudActualizada.getTecnicoId());
        }

        return solicitud;
    }

    @Override
    public void eliminar(Long id) {
        solicitudes.removeIf(s -> s.getId().equals(id));
    }
}