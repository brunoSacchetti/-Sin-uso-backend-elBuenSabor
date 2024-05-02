package com.example.BackEndElBuenSabor.business.mapper;

import com.example.BackEndElBuenSabor.domains.dtos.UnidadMedidaDto;
import com.example.BackEndElBuenSabor.domains.entities.UnidadMedida;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface IUnidadMedidaMapper extends IBaseMapper<UnidadMedida, UnidadMedidaDto> {
    UnidadMedidaDto toDTO(UnidadMedida source);
    UnidadMedida toEntity(UnidadMedidaDto source);
    List<UnidadMedidaDto> toDTOsList(List<UnidadMedida> source);
    List<UnidadMedida> toEntitiesList(List<UnidadMedidaDto> source);
}
