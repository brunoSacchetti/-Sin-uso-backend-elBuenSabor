package com.example.BackEndElBuenSabor.domains.entities;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.awt.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@ToString
@Setter
//@SuperBuilder sirve para crear objetos e inicializar los atributos de clases heredadas
// Esta clase es una generalizacion de articulo insumo y manufacturado
@Inheritance(strategy = InheritanceType.JOINED)
public class Articulo extends BaseEntidad {

    protected String denominacion;
    protected Double precioVenta;


    //ARTICULO - IMAGEN
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "articulo")
    private Set<Imagen> imagenes;


    //ARTICULO - UNIDAD MEDIDA
    @ManyToOne
    @JoinColumn(name = "unidad_medida_id")
    private UnidadMedida unidadMedida;

    //ARTICULO - CATEGORIA
    @ManyToOne
    @JoinColumn(name = "categoria_id")
    private Categoria categoria;

    // CONSTRUCTOR DE ARTICULO SIN IMAGEN
    public Articulo(String denominacion, Double precioVenta, UnidadMedida unidadMedida) {
        super();
        this.denominacion = denominacion;
        this.precioVenta = precioVenta;
        this.unidadMedida = unidadMedida;
        this.imagenes = new HashSet<Imagen>();
    }
}
