package com.example.BackEndElBuenSabor.business.mapper;

import com.example.BackEndElBuenSabor.domains.dtos.PedidoDto;
import com.example.BackEndElBuenSabor.domains.entities.Pedido;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;


@Mapper(componentModel = "spring")
public interface IPedidoMapper extends IBaseMapper<Pedido,PedidoDto> {

    PedidoDto toDTO(Pedido source);
    Pedido toEntity(PedidoDto source);
    List<PedidoDto> toDTOsList(List<Pedido> source);
    List<Pedido> toEntitiesList(List<PedidoDto> source);
}
