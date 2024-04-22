package com.example.BackEndElBuenSabor.domains.entities;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
@SuperBuilder
@Table(name = "detalle_pedido")
public class DetallePedido extends BaseEntidad{

    private Double subtotal;

    private Integer cantidad;

    // DETALLE PEDIDO - ARTICULO
    @ManyToOne
    private Articulo articulo;



}
