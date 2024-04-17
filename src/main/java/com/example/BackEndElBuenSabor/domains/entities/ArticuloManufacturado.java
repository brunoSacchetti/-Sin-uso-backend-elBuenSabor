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
@Table(name = "articulo_manufacturado")
public class ArticuloManufacturado extends BaseEntidad{

    private String denominacion;

    private String descripcion;

    private double precioVenta;

    private double precioCosto;

    private Integer tiempoEstimado;

    // ARTICULO MANUFACTURADO - PROMOCION
    @ManyToMany(mappedBy = "promocionManufacturado")
    private Set<Promocion> manufacturadoPromocion = new HashSet<>();

    // ARTICULO MANUFACTURADO - IMAGEN
    @OneToOne
    private Imagen imagen;

    // ARTICULO MANUFACTURADO - UNIDAD MEDIDA
    @ManyToOne
    @JoinColumn(name = "unidad_medida_id")
    private UnidadMedida unidadMedida;



    // METODOS NECESARIOS
    public double precioCostoCalculado() {
        return this.precioCosto;
    }

    public int stockCalculado() {
        return 0;
    }
}
