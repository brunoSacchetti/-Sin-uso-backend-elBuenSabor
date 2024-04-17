package com.example.BackEndElBuenSabor.domains.entities;

import com.example.BackEndElBuenSabor.enums.FormaPago;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Date;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Table(name = "factura_venta")
public class Factura extends BaseEntidad{

    /*private Date fechaFacturacion;

    private String numeroComprobante;

    private FormaPago formaPago;

    private BigDecimal subTotal;

    private BigDecimal descuento;

    private BigDecimal gastosEnvio;

    private BigDecimal totalVenta;*/

    private LocalDate fechaFacturacion;

    private Integer mpPaymentId;

    private Integer mpMerchantOrderId;

    private String mpPreferenceId;

    private FormaPago formaPago;

    private Double totalVenta;

}


