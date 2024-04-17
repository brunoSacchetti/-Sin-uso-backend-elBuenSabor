package com.example.BackEndElBuenSabor.domains.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Table(name = "cliente")
public class Cliente extends BaseEntidad{

    private String nombre;

    private String apellido;

    private String telefono;

    private String email;

    // CLIENTE - PEDIDO
    @OneToMany
    @JoinColumn(name = "cliente_id")
    private Set<Pedido> pedidosCliente = new HashSet<Pedido>();

    // CLIENTE - USUARIO
    @OneToOne
    private Usuario usuario;

}
