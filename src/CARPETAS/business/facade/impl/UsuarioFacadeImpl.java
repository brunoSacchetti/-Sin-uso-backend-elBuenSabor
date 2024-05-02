package com.example.BackEndElBuenSabor.business.facade.impl;

import com.example.BackEndElBuenSabor.business.facade.IUsuarioFacade;
import com.example.BackEndElBuenSabor.business.mapper.IBaseMapper;
import com.example.BackEndElBuenSabor.business.services.IBaseService;
import com.example.BackEndElBuenSabor.domains.dtos.UsuarioDto;
import com.example.BackEndElBuenSabor.domains.entities.Usuario;
import org.springframework.stereotype.Service;

@Service
public class UsuarioFacadeImpl extends BaseFacadeImpl<Usuario, UsuarioDto,Long> implements IUsuarioFacade {

    public UsuarioFacadeImpl(IBaseService<Usuario, Long> baseService, IBaseMapper<Usuario,UsuarioDto> baseMapper) {
        super(baseService, baseMapper);
    }

}
