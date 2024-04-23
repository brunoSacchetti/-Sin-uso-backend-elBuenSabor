package com.example.BackEndElBuenSabor.business.facade.impl;

import com.example.BackEndElBuenSabor.business.facade.IEmpresaFacade;
import com.example.BackEndElBuenSabor.business.mapper.IBaseMapper;
import com.example.BackEndElBuenSabor.business.services.IBaseService;
import com.example.BackEndElBuenSabor.business.services.IEmpresaService;
import com.example.BackEndElBuenSabor.domains.dtos.EmpresaDto;
import com.example.BackEndElBuenSabor.domains.entities.Empresa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class EmpresaFacadeImpl extends BaseFacadeImpl<Empresa, EmpresaDto,Long> implements IEmpresaFacade {

    public EmpresaFacadeImpl(IBaseService<Empresa, Long> baseService, IBaseMapper<Empresa, EmpresaDto> baseMapper) {
        super(baseService, baseMapper);

    }

    @Autowired
    private IEmpresaService empresaService;


    @Override
    public EmpresaDto asignarSucursales(Long id, List<Long> sucursalesIds) {
        return baseMapper.toDTO(empresaService.asignarSucursales(id, sucursalesIds)) ;
    }

    @Override
    public EmpresaDto removerSucursales(Long id, List<Long> sucursalesIds) {
        return baseMapper.toDTO(empresaService.removerSucursales(id, sucursalesIds)) ;
    }
}
