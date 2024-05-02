package com.example.BackEndElBuenSabor.business.services;

import com.example.BackEndElBuenSabor.domains.entities.Localidad;

public interface ILocalidadService extends IBaseService<Localidad,Long>{
    Localidad asignarProvincia(Long id, Long idProvincia);
}
