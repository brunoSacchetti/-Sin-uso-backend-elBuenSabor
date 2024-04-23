package com.example.BackEndElBuenSabor.business.facade;

import com.example.BackEndElBuenSabor.domains.dtos.PromocionDto;

import java.util.List;

public interface IPromocionFacade extends IBaseFacade<PromocionDto,Long> {

    PromocionDto asignarImagenes(Long id, List<Long> imagenesIds);
    PromocionDto removerImagenes(Long id, List<Long> imagenesIds);

}