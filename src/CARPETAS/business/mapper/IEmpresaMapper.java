package com.example.BackEndElBuenSabor.business.mapper;

import com.example.BackEndElBuenSabor.domains.dtos.EmpresaDto;
import com.example.BackEndElBuenSabor.domains.entities.Empresa;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface IEmpresaMapper extends IBaseMapper<Empresa, EmpresaDto> {

    EmpresaDto toDTO(Empresa source);
    Empresa toEntity(EmpresaDto source);
    List<EmpresaDto> toDTOsList(List<Empresa> source);
    List<Empresa> toEntitiesList(List<EmpresaDto> source);
}
