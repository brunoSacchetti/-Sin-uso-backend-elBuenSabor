package com.example.BackEndElBuenSabor.domains.dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class ClienteDto extends BaseDto{
    private String nombre;
    private String apellido;
    private String telefono;
    private String email;
    private UsuarioDto usuario;
    private ImagenDto imagen;
    private Set<PedidoDto> pedidos = new HashSet<>();
    private Set<DomicilioDto> domicilios = new HashSet<>();
}
