package com.example.BackEndElBuenSabor.business.services;

import com.example.BackEndElBuenSabor.domains.entities.Promocion;

import java.util.List;

public interface IPromocionService extends IBaseService<Promocion,Long> {

    Promocion asignarImagenes(Long id, List<Long> imagenesIds);
    Promocion removerImagenes(Long id, List<Long> imagenesIds);

}
