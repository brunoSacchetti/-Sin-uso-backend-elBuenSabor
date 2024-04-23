package com.example.BackEndElBuenSabor.business.mapper;

import com.example.BackEndElBuenSabor.domains.dtos.CategoriaDto;
import com.example.BackEndElBuenSabor.domains.entities.Categoria;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ICategoriaMapper extends IBaseMapper<Categoria, CategoriaDto> {

    CategoriaDto toDTO(Categoria source);
    Categoria toEntity(CategoriaDto source);
    List<CategoriaDto> toDTOsList(List<Categoria> source);
    List<Categoria> toEntitiesList(List<CategoriaDto> source);
}
