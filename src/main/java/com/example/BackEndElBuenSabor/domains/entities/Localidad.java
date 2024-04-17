package com.example.BackEndElBuenSabor.domains.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Table(name = "localidad")
public class Localidad extends BaseEntidad{

    private String nombre;

    @ManyToOne
    @JoinColumn(name = "provincia_id")
    private Provincia provincia;





}
