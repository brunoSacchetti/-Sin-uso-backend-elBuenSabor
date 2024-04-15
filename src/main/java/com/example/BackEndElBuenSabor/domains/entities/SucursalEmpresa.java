package com.example.BackEndElBuenSabor.domains.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Table(name = "sucursal_empresa")
public class SucursalEmpresa extends BaseEntidad {

    private String nombre;

    private String horarioApertura;

    private String horarioCierre;

    @OneToOne
    @JoinColumn(name = "domicilio_id")
    private Domicilio domicilio;

}
