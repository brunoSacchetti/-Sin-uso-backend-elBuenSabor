package com.example.BackEndElBuenSabor.business.mapper;

import com.example.BackEndElBuenSabor.domains.dtos.FacturaDto;
import com.example.BackEndElBuenSabor.domains.entities.Factura;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface IFacturaMapper extends IBaseMapper<Factura, FacturaDto> {
    FacturaDto toDTO(Factura source);
    Factura toEntity(FacturaDto source);
    List<FacturaDto> toDTOsList(List<Factura> source);
    List<Factura> toEntitiesList(List<FacturaDto> source);
}
