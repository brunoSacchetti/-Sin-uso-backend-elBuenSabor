package com.example.BackEndElBuenSabor.domains.entities;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.HashSet;
import java.util.Set;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
@SuperBuilder
@Table(name = "articulo_manufacturado")
public class ArticuloManufacturado extends Articulo{

    private String descripcion;

    private Integer tiempoEstimadoMinutos;

    private String preparacion;


    //ARTICULO MANUFACTURADO - ARTICULO MANUFACTURADO DETALLE
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "articuloManufacturado")
    @Builder.Default
    private Set<ArticuloManufacturadoDetalle> articuloManufacturadoDetalles = new HashSet<>();

}
