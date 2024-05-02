package com.example.BackEndElBuenSabor.business.services;

import com.example.BackEndElBuenSabor.domains.entities.Provincia;

public interface IProvinciaService extends IBaseService<Provincia,Long>{
    Provincia asignarPais(Long id, Long idPais);
}
