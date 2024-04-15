package com.example.BackEndElBuenSabor.domains.entities;

import com.example.BackEndElBuenSabor.enums.Estado;
import com.example.BackEndElBuenSabor.enums.FormaPago;
import com.example.BackEndElBuenSabor.enums.TipoEnvio;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Table(name = "pedido_venta")
public class PedidoVenta extends BaseEntidad{

    private String horaEstimadaFinalizacion;

    private BigDecimal subtotal;

    private BigDecimal descuento;

    private BigDecimal gastosEnvio;

    private BigDecimal total;

    private BigDecimal totalCosto;

    private Estado estado;

    private TipoEnvio tipoEnvio;

    private FormaPago formaPago;

    private LocalDate fechaPedido;




}
