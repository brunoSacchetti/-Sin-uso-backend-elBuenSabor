package com.example.BackEndElBuenSabor.business.facade.impl;

import com.example.BackEndElBuenSabor.business.mapper.IBaseMapper;
import com.example.BackEndElBuenSabor.business.services.IBaseService;
import com.example.BackEndElBuenSabor.domains.dtos.UnidadMedidaDto;
import com.example.BackEndElBuenSabor.domains.entities.UnidadMedida;
import org.springframework.stereotype.Service;

@Service
public class UnidadMedidaFacadeImpl extends BaseFacadeImpl<UnidadMedida, UnidadMedidaDto,Long>{
    public UnidadMedidaFacadeImpl(IBaseService<UnidadMedida, Long> baseService, IBaseMapper<UnidadMedida, UnidadMedidaDto> baseMapper) {
        super(baseService, baseMapper);
    }
}
