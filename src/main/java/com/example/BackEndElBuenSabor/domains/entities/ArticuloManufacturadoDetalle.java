package com.example.BackEndElBuenSabor.domains.entities;

import com.fasterxml.jackson.databind.ser.Serializers;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.*;
import lombok.experimental.SuperBuilder;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
@SuperBuilder
@Table(name = "articulo_manufacturado_detalle")
public class ArticuloManufacturadoDetalle extends BaseEntidad {

    private Integer cantidad;

    // ARTICULO MANUFACTURADO DETALLE - ARTICULO INSUMO
    @ManyToOne
    private ArticuloInsumo articuloInsumo;



}
