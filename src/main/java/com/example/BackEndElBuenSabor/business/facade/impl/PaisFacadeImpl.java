package com.example.BackEndElBuenSabor.business.facade.impl;

import com.example.BackEndElBuenSabor.business.facade.IPaisFacade;
import com.example.BackEndElBuenSabor.business.mapper.IBaseMapper;
import com.example.BackEndElBuenSabor.business.services.IBaseService;
import com.example.BackEndElBuenSabor.domains.dtos.PaisDto;
import com.example.BackEndElBuenSabor.domains.entities.Pais;
import org.springframework.stereotype.Service;

@Service
public class PaisFacadeImpl extends BaseFacadeImpl<Pais, PaisDto,Long> implements IPaisFacade {

    public PaisFacadeImpl(IBaseService<Pais, Long> baseService, IBaseMapper<Pais, PaisDto> baseMapper) {
        super(baseService, baseMapper);
    }

}
