package com.example.BackEndElBuenSabor.domains.entities;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.time.LocalDate;
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

    private LocalDate fechaNacimiento;

    // CLIENTE - USUARIO
    @OneToOne(cascade = CascadeType.REFRESH, fetch = FetchType.LAZY)
    @JoinColumn(name = "usuario_id")
    private Usuario usuario;

    // CLIENTE - IMAGEN
    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "imagen_id")
    private Imagen imagen;

    // CLIENTE - PEDIDO
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "cliente")
    @Builder.Default
    private Set<Pedido> pedidos = new HashSet<Pedido>();

    // CLIENTE - DOMICILIO
    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinTable(
            name = "cliente_domicilio",
            joinColumns = @JoinColumn(name = "cliente_id"),
            inverseJoinColumns = @JoinColumn(name = "domicilio_id")
    )
    @Builder.Default
    private Set<Domicilio> domicilios = new HashSet<Domicilio>();

}
