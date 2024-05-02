package com.example.BackEndElBuenSabor.business.facade.impl;

import com.example.BackEndElBuenSabor.business.facade.IFacturaFacade;
import com.example.BackEndElBuenSabor.business.mapper.IBaseMapper;
import com.example.BackEndElBuenSabor.business.services.IBaseService;
import com.example.BackEndElBuenSabor.domains.dtos.FacturaDto;
import com.example.BackEndElBuenSabor.domains.entities.Factura;
import org.springframework.stereotype.Service;

@Service
public class FacturaFacadeImpl extends BaseFacadeImpl<Factura, FacturaDto,Long> implements IFacturaFacade {
    public FacturaFacadeImpl(IBaseService<Factura, Long> baseService, IBaseMapper<Factura, FacturaDto> baseMapper) {
        super(baseService, baseMapper);
    }
}
