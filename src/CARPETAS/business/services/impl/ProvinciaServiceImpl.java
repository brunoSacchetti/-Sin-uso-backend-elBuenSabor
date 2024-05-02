package com.example.BackEndElBuenSabor.business.services.impl;

import com.example.BackEndElBuenSabor.business.services.*;
import com.example.BackEndElBuenSabor.domains.entities.Provincia;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProvinciaServiceImpl extends BaseServiceImpl<Provincia,Long> implements IProvinciaService {

    @Autowired
    private IPaisService paisService;

    @Override
    public Provincia asignarPais(Long id, Long idPais) {
        var provincia = getById(id);
        var pais = paisService.getById(idPais);
        provincia.setPais(pais);
        return update(provincia);
    }


}
