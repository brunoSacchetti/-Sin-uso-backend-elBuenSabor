package com.example.BackEndElBuenSabor.presentation.controllerRest;

import com.example.BackEndElBuenSabor.domains.dtos.PaisDto;
import com.example.BackEndElBuenSabor.domains.entities.Pais;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/paises")
public class PaisController extends BaseControllerImpl<Pais, PaisDto,Long, PaisFacadeImpl>{
    public PaisController(PaisFacadeImpl facade) {
        super(facade);
    }

}
