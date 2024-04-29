package com.example.BackEndElBuenSabor.domains.entities;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.HashSet;
import java.util.Set;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
@Builder
@Table(name = "cliente")
public class Cliente extends BaseEntidad{

    private String nombre;

    private String apellido;

    private String telefono;

    private String email;

    // CLIENTE - USUARIO
    @OneToOne
    private Usuario usuario;

    // CLIENTE - IMAGEN
    @OneToOne
    private Imagen imagen;

    // CLIENTE - PEDIDO
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "cliente")
    private Set<Pedido> pedidosCliente = new HashSet<Pedido>();

    // CLIENTE - DOMICILIO
    @ManyToMany
    @JoinTable(
            name = "cliente_domicilio",
            joinColumns = @JoinColumn(name = "cliente_id"),
            inverseJoinColumns = @JoinColumn(name = "domicilio_id")
    )
    @Builder.Default
    private Set<Domicilio> domiciliosCliente = new HashSet<Domicilio>();

}
