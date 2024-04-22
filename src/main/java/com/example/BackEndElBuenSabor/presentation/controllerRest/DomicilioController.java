package com.example.BackEndElBuenSabor.presentation.controllerRest;

import com.example.BackEndElBuenSabor.domains.dtos.DomicilioDto;
import com.example.BackEndElBuenSabor.domains.entities.Domicilio;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/domicilios")
public class DomicilioController extends BaseControllerImpl<Domicilio, DomicilioDto,Long, DomicilioFacadeImpl> {
    public DomicilioController(DomicilioFacadeImpl facade) {
        super(facade);
    }
}
