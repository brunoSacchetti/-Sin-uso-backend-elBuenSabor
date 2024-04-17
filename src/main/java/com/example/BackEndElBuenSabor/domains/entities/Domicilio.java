package com.example.BackEndElBuenSabor.domains.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Table(name = "domicilio")
public class Domicilio extends BaseEntidad{

    private String calle;

    private Integer numero;

    private Integer codigoPostal;

    @OneToOne(mappedBy = "domicilio")
    private SucursalEmpresa sucursalEmpresa;

    @ManyToOne
    @JoinColumn(name = "localidad_id")
    private Localidad localidad;


}
