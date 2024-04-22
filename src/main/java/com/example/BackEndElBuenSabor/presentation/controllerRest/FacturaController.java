package com.example.BackEndElBuenSabor.presentation.controllerRest;

import com.example.BackEndElBuenSabor.domains.dtos.FacturaDto;
import com.example.BackEndElBuenSabor.domains.entities.Factura;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/facturas")
public class FacturaController extends BaseControllerImpl<Factura, FacturaDto,Long, FacturaFacadeImpl>  {
    public FacturaController(FacturaFacadeImpl facade) {
        super(facade);
    }
}