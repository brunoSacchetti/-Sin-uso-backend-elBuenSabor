package com.example.BackEndElBuenSabor.business.facade.impl;

import com.example.BackEndElBuenSabor.business.facade.IDomicilioFacade;
import com.example.BackEndElBuenSabor.business.mapper.IBaseMapper;
import com.example.BackEndElBuenSabor.business.services.IBaseService;
import com.example.BackEndElBuenSabor.business.services.IDomicilioService;
import com.example.BackEndElBuenSabor.domains.dtos.DomicilioDto;
import com.example.BackEndElBuenSabor.domains.entities.Domicilio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DomicilioFacadeImpl extends BaseFacadeImpl<Domicilio, DomicilioDto,Long> implements IDomicilioFacade {
    public DomicilioFacadeImpl(IBaseService<Domicilio, Long> baseService, IBaseMapper<Domicilio, DomicilioDto> baseMapper) {
        super(baseService, baseMapper);
    }

    @Autowired
    private IDomicilioService domicilioService;

    @Override
    public DomicilioDto asignarLocalidad(Long id, Long idLocalidad) {
        return baseMapper.toDTO(domicilioService.asignarLocalidad(id,idLocalidad));
    }
}
