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
@Builder
@Table(name = "detalle_pedido")
public class DetallePedido extends BaseEntidad{

    private Double subTotal;

    private Integer cantidad;

    // DETALLE PEDIDO - ARTICULO
    @ManyToOne
    @JoinColumn(name = "articulo_id")
    private Articulo articulo;

    // DETALLER PEDIDO - PEDIDO
    @ManyToOne
    @JoinColumn(name = "pedido_id")
    private Pedido pedido;







}
