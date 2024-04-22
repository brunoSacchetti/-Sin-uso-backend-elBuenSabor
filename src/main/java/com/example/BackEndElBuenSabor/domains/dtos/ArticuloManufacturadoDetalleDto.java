package com.example.BackEndElBuenSabor.domains.dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class ArticuloManufacturadoDetalleDto extends BaseDto{

    private Integer cantidad;
    private ArticuloInsumoDto articuloInsumo;
}
