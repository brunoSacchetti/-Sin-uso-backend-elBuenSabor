package com.example.BackEndElBuenSabor.presentation.controllerRest;

import com.example.BackEndElBuenSabor.business.facade.impl.ArticuloInsumoFacadeImpl;
import com.example.BackEndElBuenSabor.domains.dtos.ArticuloInsumoDto;
import com.example.BackEndElBuenSabor.domains.entities.ArticuloInsumo;
import com.example.BackEndElBuenSabor.presentation.controllerRest.base.BaseControllerImpl;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/articuloInsumos")
public class ArticuloInsumoController extends BaseControllerImpl<ArticuloInsumo, ArticuloInsumoDto, Long, ArticuloInsumoFacadeImpl> {

    public ArticuloInsumoController(ArticuloInsumoFacadeImpl facade){
        super(facade);
    }

    @PutMapping("/asignarImagenes/{id}")
    public ResponseEntity<ArticuloInsumoDto> asignarImagenes(@RequestParam List<Long> imagenesIds, @PathVariable Long id){
        //logger.info("INICIO ASIGNAR IMAGENES A ARTICULO MANUFACTURADO");
        return ResponseEntity.ok(facade.asignarImagenes(id,imagenesIds));
    }

    @PutMapping("/removerImagenes/{id}")
    public ResponseEntity<ArticuloInsumoDto> removerImagenes(@RequestParam List<Long> imagenesIds, @PathVariable Long id){
        //logger.info("INICIO REMOVER IMAGENES A ARTICULO MANUFACTURADO");
        return ResponseEntity.ok(facade.removerImagenes(id,imagenesIds));
    }

    @PutMapping("/asignarUnidadMedida/{id}")
    public ResponseEntity<ArticuloInsumoDto> asignarUnidadMedida(@RequestParam Long unidadMedidaId, @PathVariable Long id){
        //logger.info("INICIO ASIGNAR DOMICILIO A SUCURSAL");
        return ResponseEntity.ok(facade.asignarUnidadMedida(id,unidadMedidaId));
    }

}
