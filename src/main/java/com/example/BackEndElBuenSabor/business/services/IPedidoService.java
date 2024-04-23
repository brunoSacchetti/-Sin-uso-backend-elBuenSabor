package com.example.BackEndElBuenSabor.business.services;

import com.example.BackEndElBuenSabor.domains.entities.Pedido;

public interface IPedidoService extends IBaseService<Pedido,Long>{
    Pedido create(Pedido entity, Long domicilioId, Long sucursalId);
}
