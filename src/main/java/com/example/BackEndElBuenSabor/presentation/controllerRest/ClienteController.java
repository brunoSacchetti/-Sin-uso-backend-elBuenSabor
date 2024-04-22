package com.example.BackEndElBuenSabor.presentation.controllerRest;

import com.example.BackEndElBuenSabor.domains.dtos.ClienteDto;
import com.example.BackEndElBuenSabor.domains.entities.Cliente;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/clientes")
public class ClienteController extends BaseControllerImpl<Cliente, ClienteDto,Long, ClienteFacadeImpl>{
    public ClienteController(ClienteFacadeImpl facade) {
        super(facade);
    }
}
