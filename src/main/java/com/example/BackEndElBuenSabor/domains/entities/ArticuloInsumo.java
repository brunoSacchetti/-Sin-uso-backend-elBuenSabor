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
@Table(name = "articulo_insumo")
public class ArticuloInsumo extends Articulo{

    private Double precioCompra;

    private Boolean esParaElaborar;

    private Integer stockActual;

    private Integer stockMaximo;

    @Builder
    public ArticuloInsumo(String denominacion, Double precioVenta, UnidadMedida unidadMedida, Double precioCompra, Boolean esParaElaborar, Integer stockActual, Integer stockMaximo) {
        super(denominacion, precioVenta, unidadMedida);
        this.precioCompra = precioCompra;
        this.esParaElaborar = esParaElaborar;
        this.stockActual = stockActual;
        this.stockMaximo = stockMaximo;
    }
}
