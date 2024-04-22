package com.example.BackEndElBuenSabor.presentation.controllerRest;

import com.example.BackEndElBuenSabor.domains.dtos.CategoriaDto;
import com.example.BackEndElBuenSabor.domains.entities.Categoria;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/categorias")
public class CategoriaController extends BaseControllerImpl<Categoria, CategoriaDto,Long, CategoriaFacadeImpl>{
    public CategoriaController(CategoriaFacadeImpl facade) {
        super(facade);
    }
}
