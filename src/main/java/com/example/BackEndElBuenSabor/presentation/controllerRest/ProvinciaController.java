package com.example.BackEndElBuenSabor.presentation.controllerRest;

import com.example.BackEndElBuenSabor.domains.dtos.ProvinciaDto;
import com.example.BackEndElBuenSabor.domains.entities.Provincia;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/provincias")
public class ProvinciaController extends BaseControllerImpl<Provincia, ProvinciaDto,Long, ProvinciaFacadeImpl> {
    public ProvinciaController(ProvinciaFacadeImpl facade) {
        super(facade);
    }
}
