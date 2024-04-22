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
@SuperBuilder
@Table(name = "sucursal_empresa")
public class SucursalEmpresa extends BaseEntidad {

    private String nombre;

    private String horarioApertura;

    private String horarioCierre;

    // SUCURSAL - DOMICILIO
    @OneToOne
    @JoinColumn(name = "domicilio_id")
    private Domicilio domicilio;

    // SUCURSAL - CATEGORIA
    @ManyToMany
    @JoinTable(name = "sucursal_categoria",
                joinColumns = @JoinColumn(name = "sucursal_id"),
                inverseJoinColumns = @JoinColumn(name = "categoria_id"))
    @Builder.Default
    private Set<Categoria> categorias = new HashSet<>();

    // SUCURSAL - PROMOCION
    @ManyToMany
    @JoinTable(name = "sucursal_promocion",
            joinColumns = @JoinColumn(name = "sucursal_id"),
            inverseJoinColumns = @JoinColumn(name = "promocion_id"))
    @Builder.Default
    private Set<Promocion> promociones = new HashSet<>();

}
