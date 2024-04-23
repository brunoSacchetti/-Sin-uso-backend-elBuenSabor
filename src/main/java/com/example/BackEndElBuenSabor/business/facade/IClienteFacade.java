package com.example.BackEndElBuenSabor.business.facade;

import com.example.BackEndElBuenSabor.domains.dtos.ClienteDto;

import java.util.List;

public interface IClienteFacade extends IBaseFacade<ClienteDto,Long>{
    ClienteDto asignarUsuario(Long id, Long idUsuario);
    ClienteDto asignarImagen(Long id, Long idImagen);
    ClienteDto asignarPedidos(Long id, List<Long> pedidosIds);
    ClienteDto removerPedidos(Long id, List<Long> pedidosIds);
    ClienteDto asignarDomicilios(Long id, List<Long> domiciliosIds);
    ClienteDto removerDomicilios(Long id, List<Long> domiciliosIds);
}