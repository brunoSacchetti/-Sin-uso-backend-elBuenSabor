package com.example.BackEndElBuenSabor.presentation.controllerRest;

import com.example.BackEndElBuenSabor.business.facade.impl.ImagenFacadeImpl;
import com.example.BackEndElBuenSabor.domains.dtos.ImagenDto;
import com.example.BackEndElBuenSabor.domains.entities.Imagen;
import com.example.BackEndElBuenSabor.presentation.controllerRest.base.BaseControllerImpl;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/imagenes")
public class ImagenController extends BaseControllerImpl<Imagen, ImagenDto,Long, ImagenFacadeImpl> {
    public ImagenController(ImagenFacadeImpl facade) {
        super(facade);
    }


}
