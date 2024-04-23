package com.example.BackEndElBuenSabor.presentation.controllerRest;

import com.example.BackEndElBuenSabor.business.facade.impl.PromocionFacadeImpl;
import com.example.BackEndElBuenSabor.domains.dtos.PromocionDto;
import com.example.BackEndElBuenSabor.domains.entities.Promocion;
import com.example.BackEndElBuenSabor.presentation.controllerRest.base.BaseControllerImpl;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/promociones")
public class PromocionController extends BaseControllerImpl<Promocion, PromocionDto, Long, PromocionFacadeImpl> {
    public PromocionController(PromocionFacadeImpl facade) {
        super(facade);
    }

    @PutMapping("/asignarImagenes/{id}")
    public ResponseEntity<PromocionDto> asignarImagenes(@RequestParam List<Long> imagenesIds, @PathVariable Long id){
        //logger.info("INICIO ASIGNAR IMAGENES A PROMOCION");
        return ResponseEntity.ok(facade.asignarImagenes(id,imagenesIds));
    }

    @PutMapping("/removerImagenes/{id}")
    public ResponseEntity<PromocionDto> removerImagenes(@RequestParam List<Long> imagenesIds, @PathVariable Long id){
        //logger.info("INICIO REMOVER IMAGENES A PROMOCION");
        return ResponseEntity.ok(facade.removerImagenes(id,imagenesIds));
    }
}
