package com.example.BackEndElBuenSabor.domains.dtos;

import com.fasterxml.jackson.databind.ser.Serializers;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class ArticuloManufacturadoDto extends BaseDto {

    private String descripcion;
    private Integer tiempoEstimadoMinutos;
    private String preparacion;

    private Set<ArticuloManufacturadoDetalleDto> articuloManufacturadoDetalles = new HashSet<>();

}
