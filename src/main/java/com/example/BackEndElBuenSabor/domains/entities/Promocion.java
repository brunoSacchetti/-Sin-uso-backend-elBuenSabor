package com.example.BackEndElBuenSabor.domains.entities;

import com.fasterxml.jackson.databind.ser.Serializers;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.HashSet;
import java.util.Set;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Table(name = "promocion")
public class Promocion extends BaseEntidad {

    private String denominacion;

    private LocalDate fechaDesde;

    private LocalDate fechaHasta;

    private LocalTime horaDesde;

    private LocalTime horaHasta;

    private double descuento;

    // PROMOCION - ARTICULO INSUMO
    @ManyToMany
    @JoinTable(
            name = "promocion_articulo_insumo",
            joinColumns = @JoinColumn(name = "promocion_id"),
            inverseJoinColumns = @JoinColumn(name = "articulo_insumo_id")
    )
    private Set<ArticuloInsumo> promocionInsumo = new HashSet<ArticuloInsumo>();

    // PROMOCION - ARTICULO MANUFACTURADO
    @ManyToMany
    @JoinTable(
            name = "promocion_articulo_manufacturado",
            joinColumns = @JoinColumn(name = "promocion_id"),
            inverseJoinColumns = @JoinColumn(name = "articulo_manufacturado_id")
    )
    private Set<ArticuloManufacturado> promocionManufacturado = new HashSet<ArticuloManufacturado>();

}
