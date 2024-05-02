package com.example.BackEndElBuenSabor.presentation.controllerRest;

import com.example.BackEndElBuenSabor.business.facade.impl.EmpresaFacadeImpl;
import com.example.BackEndElBuenSabor.domains.dtos.EmpresaDto;
import com.example.BackEndElBuenSabor.domains.entities.Empresa;
import com.example.BackEndElBuenSabor.presentation.controllerRest.base.BaseControllerImpl;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/empresas")
public class EmpresaController extends BaseControllerImpl<Empresa, EmpresaDto,Long, EmpresaFacadeImpl> {
    public EmpresaController(EmpresaFacadeImpl facade) {
        super(facade);
    }

    @PutMapping("/asignarSucursales/{id}")
    public ResponseEntity<EmpresaDto> asignarSucursales(@RequestParam List<Long> sucursalesIds, @PathVariable Long id){
        //logger.info("INICIO ASIGNAR SUCURSALES A EMPRESA");
        return ResponseEntity.ok(facade.asignarSucursales(id,sucursalesIds));
    }

    @PutMapping("/removerSucursales/{id}")
    public ResponseEntity<EmpresaDto> removerSucursales(@RequestParam List<Long> sucursalesIds, @PathVariable Long id){
        //logger.info("INICIO REMOVER SUCURSALES A EMPRESA");
        return ResponseEntity.ok(facade.removerSucursales(id,sucursalesIds));
    }
}