package com.example.BackEndElBuenSabor.domains.entities;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
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
@Table(name = "pais")
public class Pais extends BaseEntidad{

    private String nombre;

    @OneToMany(mappedBy = "pais")
    @Builder.Default
    private Set<Provincia> provincias = new HashSet<>();

}
