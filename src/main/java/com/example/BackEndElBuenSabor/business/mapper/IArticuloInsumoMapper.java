package com.example.BackEndElBuenSabor.business.mapper;

import com.example.BackEndElBuenSabor.domains.dtos.ArticuloInsumoDto;
import com.example.BackEndElBuenSabor.domains.entities.ArticuloInsumo;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface IArticuloInsumoMapper extends IBaseMapper<ArticuloInsumo, ArticuloInsumoDto> {

    ArticuloInsumoDto toDTO(ArticuloInsumo source);
    ArticuloInsumo toEntity(ArticuloInsumoDto source);
    List<ArticuloInsumoDto> toDTOsList(List<ArticuloInsumo> source);
    List<ArticuloInsumo> toEntitiesList(List<ArticuloInsumoDto> source);
}
