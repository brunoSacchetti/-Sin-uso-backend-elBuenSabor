package com.example.BackEndElBuenSabor.presentation.controllerRest.base;

import com.example.BackEndElBuenSabor.domains.dtos.BaseDto;

import java.io.Serializable;
import java.util.List;

public interface BaseController <D extends BaseDto, ID extends Serializable>{
    // obtener por id
    D getById(ID id);

    //obtener todos
    List<D> getAll();

    // crear entidad
    D create(D entity);

    D edit(D entity, ID id);

    void deleteById(ID id);
}
