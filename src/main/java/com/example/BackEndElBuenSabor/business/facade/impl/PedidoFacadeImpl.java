package com.example.BackEndElBuenSabor.business.facade.impl;

import com.example.BackEndElBuenSabor.business.facade.IPedidoFacade;
import com.example.BackEndElBuenSabor.business.mapper.IBaseMapper;
import com.example.BackEndElBuenSabor.business.services.IBaseService;
import com.example.BackEndElBuenSabor.business.services.IPedidoService;
import com.example.BackEndElBuenSabor.domains.dtos.PedidoDto;
import com.example.BackEndElBuenSabor.domains.entities.Pedido;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PedidoFacadeImpl extends BaseFacadeImpl<Pedido,PedidoDto,Long> implements IPedidoFacade {

    public PedidoFacadeImpl(IBaseService<Pedido, Long> baseService, IBaseMapper<Pedido,PedidoDto> baseMapper) {
        super(baseService, baseMapper);
    }

    @Autowired
    private IPedidoService pedidoService;

    @Override
    public PedidoDto createNew(PedidoDto request) {
        var entityToCreate = baseMapper.toEntity(request);
        var entityCreated = pedidoService.create(entityToCreate,request.getDomicilio().getId(), request.getSucursal().getId());
        return baseMapper.toDTO(entityCreated);
    }
}
