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
@Table(name = "articulo_insumo")
public class ArticuloInsumo extends Articulo{

    private Double precioCompra;

    private Boolean esParaElaborar;

    private Integer stockActual;

    private Integer stockMaximo;

    @OneToMany(mappedBy = "articuloInsumo")
    @Builder.Default
    private Set<ArticuloManufacturadoDetalle> articuloManufacturadoDetalles = new HashSet<>();


}
