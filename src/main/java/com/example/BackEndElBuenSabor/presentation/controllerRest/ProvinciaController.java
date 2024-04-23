package com.example.BackEndElBuenSabor.presentation.controllerRest;

import com.example.BackEndElBuenSabor.business.facade.impl.ProvinciaFacadeImpl;
import com.example.BackEndElBuenSabor.domains.dtos.ProvinciaDto;
import com.example.BackEndElBuenSabor.domains.entities.Provincia;
import com.example.BackEndElBuenSabor.presentation.controllerRest.base.BaseControllerImpl;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/provincias")
public class ProvinciaController extends BaseControllerImpl<Provincia, ProvinciaDto,Long, ProvinciaFacadeImpl> {
    public ProvinciaController(ProvinciaFacadeImpl facade) {
        super(facade);
    }

    @PutMapping("/asignarPais/{id}")
    public ResponseEntity<ProvinciaDto> asignarPais(@RequestParam Long paisId, @PathVariable Long id){
        //logger.info("INICIO ASIGNAR PAIS A PROVINCIA");
        return ResponseEntity.ok(facade.asignarPais(id,paisId));
    }



}
