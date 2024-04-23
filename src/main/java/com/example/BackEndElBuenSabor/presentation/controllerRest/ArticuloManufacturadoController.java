package com.example.BackEndElBuenSabor.presentation.controllerRest;

import com.example.BackEndElBuenSabor.business.facade.impl.ArticuloManufacturadoFacadeImpl;
import com.example.BackEndElBuenSabor.domains.dtos.ArticuloManufacturadoDto;
import com.example.BackEndElBuenSabor.domains.entities.ArticuloManufacturado;
import com.example.BackEndElBuenSabor.presentation.controllerRest.base.BaseControllerImpl;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/articulosManufacturados")
public class ArticuloManufacturadoController extends BaseControllerImpl<ArticuloManufacturado, ArticuloManufacturadoDto,Long, ArticuloManufacturadoFacadeImpl> {
    public ArticuloManufacturadoController(ArticuloManufacturadoFacadeImpl facade) {
        super(facade);
    }

    @PutMapping("/asignarImagenes/{id}")
    public ResponseEntity<ArticuloManufacturadoDto> asignarImagenes(@RequestParam List<Long> imagenesIds, @PathVariable Long id){
        //logger.info("INICIO ASIGNAR IMAGENES A ARTICULO MANUFACTURADO");
        return ResponseEntity.ok(facade.asignarImagenes(id,imagenesIds));
    }

    @PutMapping("/removerImagenes/{id}")
    public ResponseEntity<ArticuloManufacturadoDto> removerImagenes(@RequestParam List<Long> imagenesIds, @PathVariable Long id){
        //logger.info("INICIO REMOVER IMAGENES A ARTICULO MANUFACTURADO");
        return ResponseEntity.ok(facade.removerImagenes(id,imagenesIds));
    }

    @PutMapping("/asignarUnidadMedida/{id}")
    public ResponseEntity<ArticuloManufacturadoDto> asignarUnidadMedida(@RequestParam Long unidadMedidaId, @PathVariable Long id){
        //logger.info("INICIO ASIGNAR DOMICILIO A SUCURSAL");
        return ResponseEntity.ok(facade.asignarUnidadMedida(id,unidadMedidaId));
    }

}
