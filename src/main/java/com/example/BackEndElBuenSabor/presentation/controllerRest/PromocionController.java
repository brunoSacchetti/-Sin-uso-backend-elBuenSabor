package com.example.BackEndElBuenSabor.presentation.controllerRest;

import com.example.BackEndElBuenSabor.domains.dtos.PromocionDto;
import com.example.BackEndElBuenSabor.domains.entities.Promocion;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/promociones")
public class PromocionController extends BaseControllerImpl<Promocion, PromocionDto, Long, PromocionFacadeImpl> {
    public PromocionController(PromocionFacadeImpl facade) {
        super(facade);
    }
}
