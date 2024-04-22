package com.example.BackEndElBuenSabor.presentation.controllerRest;

import com.example.BackEndElBuenSabor.domains.dtos.LocalidadDto;
import com.example.BackEndElBuenSabor.domains.entities.Localidad;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/localidades")
public class LocalidadController extends BaseControllerImpl<Localidad, LocalidadDto,Long, LocalidadFacadeImpl> {
    public LocalidadController(LocalidadFacadeImpl facade) {
        super(facade);
    }
}
