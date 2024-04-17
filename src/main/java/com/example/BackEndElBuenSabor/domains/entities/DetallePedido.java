package com.example.BackEndElBuenSabor.domains.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
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
@Table(name = "detalle_pedido")
public class DetallePedido extends BaseEntidad{

    private Double subtotal;

    private Integer cantidad;

    @OneToOne
    private ArticuloManufacturado articuloManufacturado;

    @OneToOne
    private ArticuloInsumo articuloInsumo;



}
