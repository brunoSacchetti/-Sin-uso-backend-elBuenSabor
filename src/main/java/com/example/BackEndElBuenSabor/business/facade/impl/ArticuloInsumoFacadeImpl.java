package com.example.BackEndElBuenSabor.business.facade.impl;

import com.example.BackEndElBuenSabor.business.facade.IArticuloInsumoFacade;
import com.example.BackEndElBuenSabor.business.mapper.IBaseMapper;
import com.example.BackEndElBuenSabor.business.services.IArticuloInsumoService;
import com.example.BackEndElBuenSabor.business.services.IBaseService;
import com.example.BackEndElBuenSabor.domains.dtos.ArticuloInsumoDto;
import com.example.BackEndElBuenSabor.domains.entities.ArticuloInsumo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArticuloInsumoFacadeImpl extends BaseFacadeImpl<ArticuloInsumo, ArticuloInsumoDto,Long> implements IArticuloInsumoFacade {
    public ArticuloInsumoFacadeImpl(IBaseService<ArticuloInsumo, Long> baseService, IBaseMapper<ArticuloInsumo, ArticuloInsumoDto> baseMapper) {
        super(baseService, baseMapper);
    }

    @Autowired
    private IArticuloInsumoService articuloInsumoService;

    @Override
    public ArticuloInsumoDto asignarImagenes(Long id, List<Long> imagenesIds) {
        return baseMapper.toDTO(articuloInsumoService.asignarImagenes(id,imagenesIds));
    }

    @Override
    public ArticuloInsumoDto removerImagenes(Long id, List<Long> imagenesIds) {
        return baseMapper.toDTO(articuloInsumoService.removerImagenes(id,imagenesIds));
    }

    @Override
    public ArticuloInsumoDto asignarUnidadMedida(Long id, Long unidadMedidaId) {
        return baseMapper.toDTO(articuloInsumoService.asignarUnidadMedida(id,unidadMedidaId));
    }

}
