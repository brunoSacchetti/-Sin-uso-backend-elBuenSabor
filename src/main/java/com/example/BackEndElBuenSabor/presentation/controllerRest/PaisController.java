package com.example.BackEndElBuenSabor.presentation.controllerRest;

import com.example.BackEndElBuenSabor.business.facade.impl.PaisFacadeImpl;
import com.example.BackEndElBuenSabor.domains.dtos.PaisDto;
import com.example.BackEndElBuenSabor.domains.entities.Pais;
import com.example.BackEndElBuenSabor.presentation.controllerRest.base.BaseControllerImpl;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/paises")
public class PaisController extends BaseControllerImpl<Pais, PaisDto,Long, PaisFacadeImpl> {
    public PaisController(PaisFacadeImpl facade) {
        super(facade);
    }

}
