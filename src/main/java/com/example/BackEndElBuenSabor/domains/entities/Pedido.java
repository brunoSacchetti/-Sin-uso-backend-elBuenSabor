package com.example.BackEndElBuenSabor.domains.entities;

import com.example.BackEndElBuenSabor.enums.Estado;
import com.example.BackEndElBuenSabor.enums.FormaPago;
import com.example.BackEndElBuenSabor.enums.TipoEnvio;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.HashSet;
import java.util.Set;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
@Builder
@Table(name = "pedido")
public class Pedido extends BaseEntidad{

    private LocalTime horaEstimadaFinalizacion;

    private Double total;

    private Double totalCosto;

    private Estado estado;

    private TipoEnvio tipoEnvio;

    private FormaPago formaPago;

    private LocalDate fechaPedido;

    // PEDIDO - DOMICILIO
    @ManyToOne
    @JoinColumn(name = "domicilio_id")
    private Domicilio domicilio;

    // PEDIDO - SUCURSAL EMPRESA
    @ManyToOne
    @JoinColumn(name = "sucursal_id")
    private Sucursal sucursal;

    // PEDIDO - FACTURA
    @OneToOne
    private Factura factura;

    //SE AGREGA EL JOIN COLUMN PARA QUE JPA NO CREE LA TABLA INTERMEDIA EN UNA RELACION ONE TO MANY
    //DE ESTA MANERA PONE EL FOREIGN KEY 'pedido_id' EN LA TABLA DE LOS MANY

    // PEDIDO - DETALLE PEDIDO
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "pedido") // SE COLOCA EL CASCADEO PARA ELIMINAR EL DETALLE PEDIDO CUANDO SE DESEE ELIMINAR
    @Builder.Default
    private Set<DetallePedido> detallePedidos = new HashSet<>();

    // PEDIDO - CLIENTE
    @ManyToOne
    @JoinColumn(name = "cliente_id")
    private Cliente cliente;
}
