package com.example.BackEndElBuenSabor.presentation.controllerRest;

import com.example.BackEndElBuenSabor.domains.dtos.ArticuloInsumoDto;
import com.example.BackEndElBuenSabor.domains.entities.ArticuloInsumo;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/articuloInsumos")
public class ArticuloInsumoController extends BaseControllerImpl<ArticuloInsumo, ArticuloInsumoDto, Long, ArticuloInsumoFacadeImpl> {

    public ArticuloInsumoController(ArticuloInsumoFacadeImpl facade){
        super(facade);
    }

}
