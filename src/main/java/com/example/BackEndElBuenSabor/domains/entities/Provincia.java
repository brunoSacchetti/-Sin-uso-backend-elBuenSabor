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
@Table(name = "Provincia")
public class Provincia extends BaseEntidad{

    private String nombre;

    // PROVINCIA - PAIS
    @ManyToOne
    @JoinColumn(name = "pais_id")
    private Pais pais;

    //PROVINCIA - LOCALIDADES
    @OneToMany(mappedBy = "provincia")
    @Builder.Default
    private Set<Localidad> localidades = new HashSet<>();
}
