package com.example.BackEndElBuenSabor.domains.entities;

import com.example.BackEndElBuenSabor.enums.FormaPago;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.Date;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Table(name = "factura_venta")
public class FacturaVenta extends BaseEntidad{

    private Date fechaFacturacion;

    private String numeroComprobante;

    private FormaPago formaPago;

    private BigDecimal subTotal;

    private BigDecimal descuento;

    private BigDecimal gastosEnvio;

    private BigDecimal totalVenta;
}
