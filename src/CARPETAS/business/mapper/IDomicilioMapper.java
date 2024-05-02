package com.example.BackEndElBuenSabor.business.mapper;

import com.example.BackEndElBuenSabor.domains.dtos.DomicilioDto;
import com.example.BackEndElBuenSabor.domains.entities.Domicilio;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface IDomicilioMapper extends IBaseMapper<Domicilio, DomicilioDto> {


    DomicilioDto toDTO(Domicilio source);
    Domicilio toEntity(DomicilioDto source);
    List<DomicilioDto> toDTOsList(List<Domicilio> source);
    List<Domicilio> toEntitiesList(List<DomicilioDto> source);
}
