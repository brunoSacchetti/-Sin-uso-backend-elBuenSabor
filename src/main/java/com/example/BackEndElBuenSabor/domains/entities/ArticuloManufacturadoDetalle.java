package com.example.BackEndElBuenSabor.domains.entities;

import com.fasterxml.jackson.databind.ser.Serializers;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
@Builder
@Table(name = "articulo_manufacturado_detalle")
public class ArticuloManufacturadoDetalle extends BaseEntidad {

    private Integer cantidad;

    // ARTICULO MANUFACTURADO DETALLE - ARTICULO INSUMO
    @ManyToOne(cascade = CascadeType.REFRESH, fetch = FetchType.LAZY)
    @JoinColumn(name = "articulo_insumo_id")
    private ArticuloInsumo articuloInsumo;

    @ManyToOne
    @JoinColumn(name = "articulo_manufacturado_id")
    private ArticuloManufacturado articuloManufacturado;


}
