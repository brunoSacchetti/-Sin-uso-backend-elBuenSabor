package com.example.BackEndElBuenSabor.business.facade;

import com.example.BackEndElBuenSabor.domains.dtos.DomicilioDto;

public interface IDomicilioFacade extends IBaseFacade<DomicilioDto,Long>{
    DomicilioDto asignarLocalidad(Long id, Long idLocalidad);
}