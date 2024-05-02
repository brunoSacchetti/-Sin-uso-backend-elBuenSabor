package com.example.BackEndElBuenSabor.business.mapper;

import com.example.BackEndElBuenSabor.domains.dtos.BaseDto;
import com.example.BackEndElBuenSabor.domains.entities.BaseEntidad;

import java.util.List;

public interface IBaseMapper<E extends BaseEntidad,D extends BaseDto>{
    D toDTO(E source);
    E toEntity(D source);
    List<D> toDTOsList(List<E> source);
    List<E> toEntitiesList(List<D> source);
}