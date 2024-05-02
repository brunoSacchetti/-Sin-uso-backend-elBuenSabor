package com.example.BackEndElBuenSabor.presentation.controllerRest;

import com.example.BackEndElBuenSabor.business.facade.impl.PedidoFacadeImpl;
import com.example.BackEndElBuenSabor.domains.dtos.PedidoDto;
import com.example.BackEndElBuenSabor.domains.entities.Pedido;
import com.example.BackEndElBuenSabor.presentation.controllerRest.base.BaseControllerImpl;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/pedidos")
public class PedidoController extends BaseControllerImpl<Pedido, PedidoDto,Long, PedidoFacadeImpl> {
    public PedidoController(PedidoFacadeImpl facade) {
        super(facade);
    }


}