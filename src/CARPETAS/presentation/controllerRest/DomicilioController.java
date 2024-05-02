package com.example.BackEndElBuenSabor.presentation.controllerRest;

import com.example.BackEndElBuenSabor.business.facade.impl.DomicilioFacadeImpl;
import com.example.BackEndElBuenSabor.domains.dtos.DomicilioDto;
import com.example.BackEndElBuenSabor.domains.entities.Domicilio;
import com.example.BackEndElBuenSabor.presentation.controllerRest.base.BaseControllerImpl;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/domicilios")
public class DomicilioController extends BaseControllerImpl<Domicilio, DomicilioDto,Long, DomicilioFacadeImpl> {
    public DomicilioController(DomicilioFacadeImpl facade) {
        super(facade);
    }

    @PutMapping("/asignarLocalidad/{id}")
    public ResponseEntity<DomicilioDto> asignarLocalidad(@RequestParam Long localidadId, @PathVariable Long id){
        //logger.info("INICIO ASIGNAR LOCALIDAD A DOMICILIO ");
        return ResponseEntity.ok(facade.asignarLocalidad(id,localidadId));
    }
}
