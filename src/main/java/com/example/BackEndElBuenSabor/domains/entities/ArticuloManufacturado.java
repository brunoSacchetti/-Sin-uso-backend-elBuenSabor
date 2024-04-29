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
@Table(name = "articulo_manufacturado")
public class ArticuloManufacturado extends Articulo{

    private String descripcion;

    private Integer tiempoEstimadoMinutos;

    private String preparacion;


    //ARTICULO MANUFACTURADO - ARTICULO MANUFACTURADO DETALLE
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "articuloManufacturado")
    private Set<ArticuloManufacturadoDetalle> articuloManufacturadoDetalles;

    @Builder
    public ArticuloManufacturado(String denominacion, Double precioVenta,UnidadMedida unidadMedida, String descripcion, Integer tiempoEstimadoMinutos, String preparacion, Set<ArticuloManufacturadoDetalle> articuloManufacturadoDetalles) {
        super(denominacion, precioVenta, unidadMedida);
        this.descripcion = descripcion;
        this.tiempoEstimadoMinutos = tiempoEstimadoMinutos;
        this.preparacion = preparacion;
        this.articuloManufacturadoDetalles = new HashSet<>();
    }
}
