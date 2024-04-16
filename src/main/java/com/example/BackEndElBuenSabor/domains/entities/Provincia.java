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
@Table(name = "Provincia")
public class Provincia extends BaseEntidad{

    private String nombre;

    @OneToMany(mappedBy = "provincia", cascade = CascadeType.ALL)
    private List<Localidad> localidades = new ArrayList<Localidad>();

    @ManyToOne
    @JoinColumn(name = "pais_id")
    private Pais pais;

}
