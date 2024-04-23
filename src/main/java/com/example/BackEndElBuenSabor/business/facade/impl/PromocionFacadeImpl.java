package com.example.BackEndElBuenSabor.business.facade.impl;

import com.example.BackEndElBuenSabor.business.facade.IPromocionFacade;
import com.example.BackEndElBuenSabor.business.mapper.IBaseMapper;
import com.example.BackEndElBuenSabor.domains.dtos.PromocionDto;
import com.example.BackEndElBuenSabor.domains.entities.Promocion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PromocionFacadeImpl extends BaseFacadeImpl<Promocion, PromocionDto, Long> implements IPromocionFacade {
    public PromocionFacadeImpl(IBaseService<Promocion, Long> baseService, IBaseMapper<Promocion, PromocionDto> baseMapper) {
        super(baseService, baseMapper);
    }

    @Autowired
    private IPromocionService promocionService;

    @Override
    public PromocionDto asignarImagenes(Long id, List<Long> imagenesIds) {
        return baseMapper.toDTO(promocionService.asignarImagenes(id,imagenesIds));
    }

    @Override
    public PromocionDto removerImagenes(Long id, List<Long> imagenesIds) {
        return baseMapper.toDTO(promocionService.removerImagenes(id,imagenesIds));
    }
}
