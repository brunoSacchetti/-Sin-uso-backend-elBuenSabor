package com.example.BackEndElBuenSabor.presentation.controllerRest;

import com.example.BackEndElBuenSabor.business.facade.impl.CategoriaFacadeImpl;
import com.example.BackEndElBuenSabor.domains.dtos.CategoriaDto;
import com.example.BackEndElBuenSabor.domains.entities.Categoria;
import com.example.BackEndElBuenSabor.presentation.controllerRest.base.BaseControllerImpl;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/categorias")
public class CategoriaController extends BaseControllerImpl<Categoria, CategoriaDto,Long, CategoriaFacadeImpl> {
    public CategoriaController(CategoriaFacadeImpl facade){
        super(facade);
    };

    @PutMapping("/asignarSubcategorias/{id}")
    public ResponseEntity<CategoriaDto> asignarSubcategorias(@RequestParam List<Long> subcategoriasIds, @PathVariable Long id){
        //logger.info("INICIO ASIGNAR SUBCATEGORIAS A CATEGORIAS");
        return ResponseEntity.ok(facade.asignarSubcategorias(id,subcategoriasIds));
    }

    @PutMapping("/removerSubcategorias/{id}")
    public ResponseEntity<CategoriaDto> removerSubcategorias(@RequestParam List<Long> subcategoriasIds, @PathVariable Long id){
        //logger.info("INICIO REMOVER SUBCATEGORIAS A CATEGORIAS");
        return ResponseEntity.ok(facade.removerSubcategorias(id,subcategoriasIds));
    }

    @PutMapping("/asignarArticulos/{id}")
    public ResponseEntity<CategoriaDto> asignarArticulos(@RequestParam List<Long> articulosIds, @PathVariable Long id){
        //logger.info("INICIO ASIGNAR ARTICULOS A CATEGORIAS");
        return ResponseEntity.ok(facade.asignarArticulos(id,articulosIds));
    }

    @PutMapping("/removerArticulos/{id}")
    public ResponseEntity<CategoriaDto> removerArticulos(@RequestParam List<Long> articulosIds, @PathVariable Long id){
        //logger.info("INICIO REMOVER ARTICULOS A CATEGORIAS");
        return ResponseEntity.ok(facade.removerArticulos(id,articulosIds));
    }
}
