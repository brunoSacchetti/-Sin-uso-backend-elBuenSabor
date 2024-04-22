package com.example.BackEndElBuenSabor.presentation.controllerRest;

import com.example.BackEndElBuenSabor.domains.dtos.PedidoDto;
import com.example.BackEndElBuenSabor.domains.entities.Pedido;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pedidos")
public class PedidoController extends BaseControllerImpl<Pedido, PedidoDto,Long, PedidoFacadeImpl> {
    public PedidoController(PedidoFacadeImpl facade) {
        super(facade);
    }
}