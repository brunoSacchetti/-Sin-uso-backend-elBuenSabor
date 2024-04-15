package com.example.BackEndElBuenSabor.domains.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

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

    public double precioCostoCalculado() {
        return this.precioCosto;
    }

    public int stockCalculado() {
        return 0;
    }
}
