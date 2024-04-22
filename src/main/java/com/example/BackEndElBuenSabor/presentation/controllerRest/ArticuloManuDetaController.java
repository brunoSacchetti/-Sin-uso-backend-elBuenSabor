package com.example.BackEndElBuenSabor.presentation.controllerRest;

import com.example.BackEndElBuenSabor.domains.dtos.ArticuloManufacturadoDetalleDto;
import com.example.BackEndElBuenSabor.domains.entities.ArticuloManufacturadoDetalle;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/articulosManufactDetalles")
public class ArticuloManuDetaController extends BaseControllerImpl<ArticuloManufacturadoDetalle, ArticuloManufacturadoDetalleDto,Long, ArticuloManufacturadoDetalleFacadeImpl> {
    public ArticuloManufacturadoDetalleController(ArticuloManufacturadoDetalleFacadeImpl facade) {
        super(facade);
    }
}
