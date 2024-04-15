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
@Table(name = "articulo_insumo")
public class ArticuloInsumo extends BaseEntidad{

    private String denominacion;

    private double precioCompra;

    private double precioVenta;

    private Boolean esParaElaborar;

}
