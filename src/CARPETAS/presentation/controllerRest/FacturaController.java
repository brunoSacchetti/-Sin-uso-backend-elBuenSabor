package com.example.BackEndElBuenSabor.presentation.controllerRest;

import com.example.BackEndElBuenSabor.business.facade.impl.FacturaFacadeImpl;
import com.example.BackEndElBuenSabor.domains.dtos.FacturaDto;
import com.example.BackEndElBuenSabor.domains.entities.Factura;
import com.example.BackEndElBuenSabor.presentation.controllerRest.base.BaseControllerImpl;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/facturas")
public class FacturaController extends BaseControllerImpl<Factura, FacturaDto,Long, FacturaFacadeImpl> {
    public FacturaController(FacturaFacadeImpl facade) {
        super(facade);
    }

}