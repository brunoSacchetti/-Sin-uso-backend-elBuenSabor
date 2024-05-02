package com.example.BackEndElBuenSabor.business.services;

import com.example.BackEndElBuenSabor.domains.entities.Domicilio;

public interface IDomicilioService extends IBaseService<Domicilio,Long>{
    Domicilio asignarLocalidad(Long id, Long idLocalidad);
}
