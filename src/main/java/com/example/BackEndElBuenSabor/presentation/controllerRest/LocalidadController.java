package com.example.BackEndElBuenSabor.presentation.controllerRest;

import com.example.BackEndElBuenSabor.business.facade.impl.LocalidadFacadeImpl;
import com.example.BackEndElBuenSabor.domains.dtos.LocalidadDto;
import com.example.BackEndElBuenSabor.domains.entities.Localidad;
import com.example.BackEndElBuenSabor.presentation.controllerRest.base.BaseControllerImpl;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/localidades")
public class LocalidadController extends BaseControllerImpl<Localidad, LocalidadDto,Long, LocalidadFacadeImpl> {
    public LocalidadController(LocalidadFacadeImpl facade) {
        super(facade);
    }
    @PutMapping("/asignarProvincia/{id}")
    public ResponseEntity<LocalidadDto> asignarProvincia(@RequestParam Long provinciaId, @PathVariable Long id){
        //logger.info("INICIO ASIGNAR PROVINCIA A LOCALIDAD");
        return ResponseEntity.ok(facade.asignarProvincia(id,provinciaId));
    }
}
