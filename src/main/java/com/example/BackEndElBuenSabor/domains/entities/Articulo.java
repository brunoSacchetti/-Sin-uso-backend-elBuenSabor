package com.example.BackEndElBuenSabor.domains.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
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
@SuperBuilder //sirve para crear objetos e inicializar los atributos de clases heredadas
// Esta clase es una generalizacion de articulo insumo y manufacturado
public class Articulo extends BaseEntidad {

    protected String denominacion;
    protected Double precioVenta;


    //ARTICULO - IMAGEN
    @OneToMany
    //SE AGREGA EL JOIN COLUMN PARA QUE JPA NO CREE LA TABLA INTERMEDIA EN UNA RELACION ONE TO MANY
    //DE ESTA MANERA PONE EL FOREIGN KEY 'cliente_id' EN LA TABLA DE LOS MANY
    @JoinColumn(name = "articulo_id")
    @Builder.Default
    private Set<Imagen> imagenes = new HashSet<Imagen>();


    //ARTICULO - UNIDAD MEDIDA
    @ManyToOne
    private UnidadMedida unidadMedida;

    // CONSTRUCTOR DE ARTICULO SIN IMAGEN
    public Articulo(String denominacion, Double precioVenta, UnidadMedida unidadMedida) {
        this.denominacion = denominacion;
        this.precioVenta = precioVenta;
        this.unidadMedida = unidadMedida;
    }
}
