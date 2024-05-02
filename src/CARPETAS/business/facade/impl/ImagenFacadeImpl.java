package com.example.BackEndElBuenSabor.business.facade.impl;

import com.example.BackEndElBuenSabor.business.facade.IImagenFacade;
import com.example.BackEndElBuenSabor.business.mapper.IBaseMapper;
import com.example.BackEndElBuenSabor.business.services.IBaseService;
import com.example.BackEndElBuenSabor.domains.dtos.ImagenDto;
import com.example.BackEndElBuenSabor.domains.entities.Imagen;
import org.springframework.stereotype.Service;

@Service
public class ImagenFacadeImpl extends BaseFacadeImpl<Imagen, ImagenDto,Long> implements IImagenFacade {
    public ImagenFacadeImpl(IBaseService<Imagen, Long> baseService, IBaseMapper<Imagen, ImagenDto> baseMapper) {
        super(baseService, baseMapper);
    }
}
