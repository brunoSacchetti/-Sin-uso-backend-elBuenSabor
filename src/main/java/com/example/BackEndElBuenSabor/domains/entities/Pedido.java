package com.example.BackEndElBuenSabor.domains.entities;

import com.example.BackEndElBuenSabor.enums.Estado;
import com.example.BackEndElBuenSabor.enums.FormaPago;
import com.example.BackEndElBuenSabor.enums.TipoEnvio;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Table(name = "pedido_venta")
public class Pedido extends BaseEntidad{

    private String horaEstimadaFinalizacion;

    private Double subtotal;

    //private BigDecimal descuento;

    private Double gastosEnvio;

    private Double total;

    private Double totalCosto;

    private Estado estado;

    private TipoEnvio tipoEnvio;

    private FormaPago formaPago;

    private LocalDate fechaPedido;

    //SE AGREGA EL JOIN COLUMN PARA QUE JPA NO CREE LA TABLA INTERMEDIA EN UNA RELACION ONE TO MANY
    //DE ESTA MANERA PONE EL FOREIGN KEY 'pedido_id' EN LA TABLA DE LOS MANY
    // PEDIDO - DETALLE PEDIDO
    @OneToMany(cascade = CascadeType.ALL) // SE COLOCA EL CASCADEO PARA ELIMINAR EL DETALLE PEDIDO CUANDO SE DESEE ELIMINAR
    @JoinColumn(name = "pedido_id")
    private Set<DetallePedido> detallePedidos = new HashSet<>();

    // PEDIDO - DOMICILIO
    @ManyToOne
    private Domicilio domicilio;

    // PEDIDO - FACTURA
    @OneToOne
    private Factura factura;

}
