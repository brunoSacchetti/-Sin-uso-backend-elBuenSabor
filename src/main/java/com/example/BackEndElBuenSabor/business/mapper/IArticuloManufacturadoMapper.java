package com.example.BackEndElBuenSabor.business.mapper;


import com.example.BackEndElBuenSabor.domains.dtos.ArticuloManufacturadoDto;
import com.example.BackEndElBuenSabor.domains.entities.ArticuloManufacturado;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;
@Mapper(componentModel = "spring")
public interface IArticuloManufacturadoMapper extends IBaseMapper<ArticuloManufacturado, ArticuloManufacturadoDto>{

    ArticuloManufacturadoDto toDTO(ArticuloManufacturado source);
    ArticuloManufacturado toEntity(ArticuloManufacturadoDto source);
    List<ArticuloManufacturadoDto> toDTOsList(List<ArticuloManufacturado> source);
    List<ArticuloManufacturado> toEntitiesList(List<ArticuloManufacturadoDto> source);
}
