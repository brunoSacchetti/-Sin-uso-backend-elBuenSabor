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
@SuperBuilder //sirve para crear objetos e inicializar los atributos de clases heredadas
// Esta clase es una generalizacion de articulo insumo y manufacturado
@Inheritance(strategy = InheritanceType.JOINED) // TABLE_PER_CLASS
public abstract class Articulo extends BaseEntidad {

    protected String denominacion;
    protected Double precioVenta;


    //ARTICULO - IMAGEN
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "articulo")
    @Builder.Default
    private Set<Imagen> imagenes = new HashSet<>();


    //ARTICULO - UNIDAD MEDIDA
    @ManyToOne(cascade = CascadeType.REFRESH, fetch = FetchType.LAZY)
    @JoinColumn(name = "unidad_medida_id")
    private UnidadMedida unidadMedida;


    //ARTICULO - CATEGORIA
    @ManyToOne(cascade = CascadeType.REFRESH, fetch = FetchType.LAZY)
    @JoinColumn(name = "categoria_id")
    private Categoria categoria;

    //ARTICULO - DETALLE PEDIDO
    @OneToMany(mappedBy = "articulo")
    @Builder.Default
    protected Set<DetallePedido> detallePedidos = new HashSet<>();

    //ARTICULO - PROMOCIONES
    @ManyToMany(mappedBy = "articulos", cascade = CascadeType.PERSIST, fetch = FetchType.LAZY)
    @Builder.Default
    protected Set<Promocion> estaEnPromociones = new HashSet<>();

}
