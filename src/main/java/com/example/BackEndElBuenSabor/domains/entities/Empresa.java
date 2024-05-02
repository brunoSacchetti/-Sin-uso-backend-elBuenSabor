package com.example.BackEndElBuenSabor.domains.entities;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
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
@Table(name = "empresa")
public class Empresa extends BaseEntidad{

    private String nombre;

    private int cuil;

    private String razonSocial;

    //EMPRESA - SUCURSAL
    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.LAZY, mappedBy = "empresa")
    //@JsonIgnoreProperties("empresa")
    @Builder.Default
    private Set<Sucursal> sucursales = new HashSet<>();


}
