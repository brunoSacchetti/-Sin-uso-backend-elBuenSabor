package com.example.BackEndElBuenSabor.business.facade.impl;

import com.example.BackEndElBuenSabor.business.facade.IProvinciaFacade;
import com.example.BackEndElBuenSabor.business.mapper.IBaseMapper;
import com.example.BackEndElBuenSabor.business.services.IBaseService;
import com.example.BackEndElBuenSabor.business.services.IProvinciaService;
import com.example.BackEndElBuenSabor.domains.dtos.ProvinciaDto;
import com.example.BackEndElBuenSabor.domains.entities.Provincia;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProvinciaFacadeImpl extends BaseFacadeImpl<Provincia, ProvinciaDto,Long> implements IProvinciaFacade {
    public ProvinciaFacadeImpl(IBaseService<Provincia, Long> baseService, IBaseMapper<Provincia, ProvinciaDto> baseMapper) {
        super(baseService, baseMapper);
    }

    @Autowired
    private IProvinciaService provinciaService;

    @Override
    public ProvinciaDto asignarPais(Long id, Long idPais) {
        return baseMapper.toDTO(provinciaService.asignarPais(id,idPais));
    }

}
