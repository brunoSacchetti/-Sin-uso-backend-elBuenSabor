package com.example.BackEndElBuenSabor.domains.entities;

import jakarta.persistence.*;
import jakarta.persistence.Entity;
import jakarta.persistence.criteria.CriteriaBuilder;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
@Builder
public class Domicilio extends BaseEntidad{

    private String calle;

    private Integer numero;

    private Integer codigoPostal;

    private Integer piso;

    private Integer nroDepto;

    @ManyToOne
    @JoinColumn(name = "localidad_id")
    private Localidad localidad;

    @ManyToMany(mappedBy = "domicilios", cascade = CascadeType.REFRESH, fetch = FetchType.LAZY)
    @Builder.Default
    private Set<Cliente> clientes = new HashSet<>();


    @OneToOne(mappedBy = "domicilio")
    private Sucursal sucursal;

    @OneToMany(mappedBy = "domicilio")
    @Builder.Default
    private Set<Pedido> pedidos = new HashSet<>();


}
