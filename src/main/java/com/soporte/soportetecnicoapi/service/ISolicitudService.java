package com.soporte.soportetecnicoapi.service;

import com.soporte.soportetecnicoapi.model.Solicitud;
import java.util.List;

public interface ISolicitudService {

    List<Solicitud> listar();

    Solicitud buscarPorId(Long id);

    Solicitud guardar(Solicitud solicitud);

    Solicitud actualizar(Long id, Solicitud solicitud);

    void eliminar(Long id);
}
