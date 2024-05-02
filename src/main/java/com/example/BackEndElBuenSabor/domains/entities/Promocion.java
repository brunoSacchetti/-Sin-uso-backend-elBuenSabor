package com.example.BackEndElBuenSabor.domains.entities;

import com.example.BackEndElBuenSabor.enums.TipoPromocion;
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
@Builder
@Table(name = "promocion")
public class Promocion extends BaseEntidad {

    private String denominacion;
    private LocalDate fechaDesde;
    private LocalDate fechaHasta;
    private LocalTime horaDesde;
    private LocalTime horaHasta;
    private String descripcionDescuento;
    private Double precioPromocional;
    private TipoPromocion tipoPromocion;

    // PROMOCION - ARTICULO
    @ManyToMany(cascade = CascadeType.REFRESH, fetch = FetchType.LAZY)
    @JoinTable(
            name = "promocion_articulo",
            joinColumns = @JoinColumn(name = "promocion_id"),
            inverseJoinColumns = @JoinColumn(name = "articulo_id")
    )
    @Builder.Default
    private Set<Articulo> articulos = new HashSet<>();

    // PROMOCION - IMAGEN
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "promocion")
    @Builder.Default
    private Set<Imagen> imagenes = new HashSet<>();

    //PROMOCION - SUCURSAL
    @ManyToOne
    @JoinColumn(name = "sucursal_id")
    private Sucursal sucursal;

}
