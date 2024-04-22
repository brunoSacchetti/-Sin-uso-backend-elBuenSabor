package com.example.BackEndElBuenSabor.domains.dtos;

import com.example.BackEndElBuenSabor.enums.Estado;
import com.example.BackEndElBuenSabor.enums.FormaPago;
import com.example.BackEndElBuenSabor.enums.TipoEnvio;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.HashSet;
import java.util.Set;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class PedidoDto extends BaseDto{
    private LocalTime horaEstimadaFinalizacion;
    private Double total;
    private Double totalCosto;
    private Estado estado;
    private TipoEnvio tipoEnvio;
    private FormaPago formaPago;
    private LocalDate fechaPedido;
    private DomicilioDto domicilio;
    private SucursalDto sucursal;
    private FacturaDto factura;
    private Set<DetallePedidoDto> detallePedidos = new HashSet<>();
}
