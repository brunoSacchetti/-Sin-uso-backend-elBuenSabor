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
@Table(name = "localidad")
public class Localidad extends BaseEntidad{

    private String nombre;

    // LOCALIDAD - PROVINCIA
    @ManyToOne
    @JoinColumn(name = "provincia_id")
    private Provincia provincia;





}
