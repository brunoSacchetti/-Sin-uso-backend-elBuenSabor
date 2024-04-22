package com.example.BackEndElBuenSabor.domains.entities;


import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
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
@Table(name = "empresa")
public class Empresa extends BaseEntidad{

    private String nombre;

    private int cuil;

    private String razonSocial;

    //EMPRESA - SUCURSAL
    @OneToMany // (cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.EAGER)
    @JoinColumn(name = "empresa_id")
    @Builder.Default
    private Set<Sucursal> sucursales = new HashSet<>();


}
