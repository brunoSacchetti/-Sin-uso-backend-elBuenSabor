package com.example.BackEndElBuenSabor.presentation.controllerRest;

import com.example.BackEndElBuenSabor.business.facade.impl.SucursalFacadeImpl;
import com.example.BackEndElBuenSabor.domains.dtos.SucursalDto;
import com.example.BackEndElBuenSabor.domains.entities.Sucursal;
import com.example.BackEndElBuenSabor.presentation.controllerRest.base.BaseControllerImpl;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/sucursales")
public class SucursalController extends BaseControllerImpl<Sucursal, SucursalDto,Long, SucursalFacadeImpl> {
    public SucursalController(SucursalFacadeImpl facade) {
        super(facade);
    }

    @PutMapping("/asignarDomicilio/{id}")
    public ResponseEntity<SucursalDto> asignarDomicilio(@RequestParam Long domicilioId, @PathVariable Long id){
        //logger.info("INICIO ASIGNAR DOMICILIO A SUCURSAL");
        return ResponseEntity.ok(facade.asignarDocimilio(id,domicilioId));
    }

    @PutMapping("/asignarCategorias/{id}")
    public ResponseEntity<SucursalDto> asignarCategorias(@RequestParam List<Long> categoriasIds, @PathVariable Long id){
        //logger.info("INICIO ASIGNAR CATEGORIAS A SUCURSAL");
        return ResponseEntity.ok(facade.asignarCategorias(id,categoriasIds));
    }

    @PutMapping("/removerCategorias/{id}")
    public ResponseEntity<SucursalDto> removerCategorias(@RequestParam List<Long> categoriasIds, @PathVariable Long id){
        //logger.info("INICIO REMOVER CATEGORIAS A SUCURSAL");
        return ResponseEntity.ok(facade.removerCategorias(id,categoriasIds));
    }

    @PutMapping("/asignarPromociones/{id}")
    public ResponseEntity<SucursalDto> asignarPromociones(@RequestParam List<Long> promocionesIds, @PathVariable Long id){
        //logger.info("INICIO ASIGNAR PROMOCIONES A SUCURSAL");
        return ResponseEntity.ok(facade.asignarPromociones(id,promocionesIds));
    }

    @PutMapping("/removerPromociones/{id}")
    public ResponseEntity<SucursalDto> removerPromociones(@RequestParam List<Long> promocionesIds, @PathVariable Long id){
        //logger.info("INICIO REMOVER PROMOCIONES A SUCURSAL");
        return ResponseEntity.ok(facade.removerPromociones(id,promocionesIds));
    }
}
