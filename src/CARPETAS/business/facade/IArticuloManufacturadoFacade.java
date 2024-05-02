package com.example.BackEndElBuenSabor.business.facade;

import com.example.BackEndElBuenSabor.domains.dtos.ArticuloManufacturadoDto;

import java.util.List;

public interface IArticuloManufacturadoFacade extends IBaseFacade<ArticuloManufacturadoDto,Long>{

    ArticuloManufacturadoDto asignarImagenes(Long id, List<Long> imagenesIds);
    ArticuloManufacturadoDto removerImagenes(Long id, List<Long> imagenesIds);
    ArticuloManufacturadoDto asignarUnidadMedida(Long id, Long unidadMedidaId);

}
