package com.example.BackEndElBuenSabor.domains.entities;

import com.fasterxml.jackson.databind.ser.Serializers;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.HashSet;
import java.util.Set;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
@SuperBuilder
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
            name = "promocion_articulo",
            joinColumns = @JoinColumn(name = "promocion_id"),
            inverseJoinColumns = @JoinColumn(name = "articulo_id")
    )
    @Builder.Default
    private Set<ArticuloInsumo> promocionInsumo = new HashSet<ArticuloInsumo>();

    // PROMOCION - IMAGEN
    @OneToMany
    @JoinColumn(name = "promocion_id")
    @Builder.Default
    private Set<Imagen> imagenes = new HashSet<>();

}
