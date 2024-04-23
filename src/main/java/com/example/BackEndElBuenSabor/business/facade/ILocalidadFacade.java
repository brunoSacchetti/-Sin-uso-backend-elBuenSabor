package com.example.BackEndElBuenSabor.business.facade;

import com.example.BackEndElBuenSabor.domains.dtos.LocalidadDto;

public interface ILocalidadFacade extends IBaseFacade<LocalidadDto,Long>{
    LocalidadDto asignarProvincia(Long id, Long idProvincia);
}