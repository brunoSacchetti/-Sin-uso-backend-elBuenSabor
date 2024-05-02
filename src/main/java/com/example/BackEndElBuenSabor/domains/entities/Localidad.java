package com.example.BackEndElBuenSabor.domains.entities;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.ArrayList;
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
@Table(name = "localidad")
public class Localidad extends BaseEntidad{

    private String nombre;

    // LOCALIDAD - PROVINCIA
    @ManyToOne(cascade = CascadeType.REFRESH, fetch = FetchType.LAZY)
    @JoinColumn(name = "provincia_id")
    private Provincia provincia;

    // LOCALIDAD - DOMICILIO
    @OneToMany(mappedBy = "localidad")
    @Builder.Default
    private Set<Domicilio> domicilios = new HashSet<>();



}
