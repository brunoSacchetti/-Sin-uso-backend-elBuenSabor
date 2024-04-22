package com.example.BackEndElBuenSabor.domains.entities;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.ArrayList;
import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
@SuperBuilder
@Table(name = "Provincia")
public class Provincia extends BaseEntidad{

    private String nombre;

    // PROVINCIA - PAIS
    @ManyToOne
    @JoinColumn(name = "pais_id")
    private Pais pais;
}
