package com.example.BackEndElBuenSabor.business.facade.impl;

import com.example.BackEndElBuenSabor.business.facade.ILocalidadFacade;
import com.example.BackEndElBuenSabor.business.mapper.IBaseMapper;
import com.example.BackEndElBuenSabor.business.services.IBaseService;
import com.example.BackEndElBuenSabor.business.services.ILocalidadService;
import com.example.BackEndElBuenSabor.domains.dtos.LocalidadDto;
import com.example.BackEndElBuenSabor.domains.entities.Localidad;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LocalidadFacadeImpl extends BaseFacadeImpl<Localidad, LocalidadDto,Long> implements ILocalidadFacade {
    public LocalidadFacadeImpl(IBaseService<Localidad, Long> baseService, IBaseMapper<Localidad, LocalidadDto> baseMapper) {
        super(baseService, baseMapper);
    }
    @Autowired
    private ILocalidadService localidadService;

    @Override
    public LocalidadDto asignarProvincia(Long id, Long idProvincia) {
        return baseMapper.toDTO(localidadService.asignarProvincia(id,idProvincia));
    }

}
