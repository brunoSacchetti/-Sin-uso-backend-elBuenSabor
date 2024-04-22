package com.example.BackEndElBuenSabor.presentation.controllerRest;

import com.example.BackEndElBuenSabor.domains.dtos.SucursalDto;
import com.example.BackEndElBuenSabor.domains.entities.Sucursal;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sucursales")
public class SucursalController extends BaseControllerImpl<Sucursal, SucursalDto,Long, SucursalFacadeImpl> {
    public SucursalController(SucursalFacadeImpl facade) {
        super(facade);
    }
}
