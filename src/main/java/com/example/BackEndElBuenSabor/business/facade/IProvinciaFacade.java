package com.example.BackEndElBuenSabor.business.facade;

import com.example.BackEndElBuenSabor.domains.dtos.ProvinciaDto;

public interface IProvinciaFacade extends IBaseFacade<ProvinciaDto,Long>{

    ProvinciaDto asignarPais(Long id, Long idPais);

}
