package com.example.BackEndElBuenSabor.domains.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Table(name = "articulo_insumo")
public class ArticuloInsumo extends BaseEntidad{

    private String denominacion;

    private double precioCompra;

    private double precioVenta;

    private Boolean esParaElaborar;

    private Integer stockActual;

    private Integer stockMaximo;

    // ARTICULO INSUMO - PROMOCION
    @ManyToMany(mappedBy = "promocionInsumo")
    private Set<Promocion> insumoPromocion = new HashSet<>();

    // ARTICULO INSUMO - IMAGEN
    @OneToOne
    private Imagen imagen;

    // ARTICULO INSUMO - UNIDAD MEDIDA
    @ManyToOne
    @JoinColumn(name = "unidad_medida_id")
    private UnidadMedida unidadMedida;



}
