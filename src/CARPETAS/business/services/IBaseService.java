package com.example.BackEndElBuenSabor.business.services;

import com.example.BackEndElBuenSabor.domains.entities.BaseEntidad;

import java.io.Serializable;
import java.util.List;

public interface IBaseService<E extends BaseEntidad, ID extends Serializable> {
    E create(E user);
    E getById(ID id);
    List<E> getAll();
    void deleteById(ID id);
    E update(E user);
}
