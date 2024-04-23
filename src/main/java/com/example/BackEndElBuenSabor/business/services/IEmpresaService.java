package com.example.BackEndElBuenSabor.business.services;



import com.example.BackEndElBuenSabor.domains.entities.Empresa;

import java.util.List;

public interface IEmpresaService extends IBaseService<Empresa,Long>{
    Empresa asignarSucursales(Long id, List<Long> sucursalesIds);
    Empresa removerSucursales(Long id, List<Long> sucursalesIds);
}
