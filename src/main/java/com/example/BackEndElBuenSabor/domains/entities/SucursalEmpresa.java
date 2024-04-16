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
@Table(name = "sucursal_empresa")
public class SucursalEmpresa extends BaseEntidad {

    private String nombre;

    private String horarioApertura;

    private String horarioCierre;

    //SUCURSAL - EMPRESA
    @ManyToOne
    @JoinColumn(name = "empresa_id")
    private Empresa empresa;

    // SUCURSAL - DOMICILIO
    @OneToOne
    @JoinColumn(name = "domicilio_id")
    private Domicilio domicilio;

    //SUCURSAL - SUCURSAL INSUMO
    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinTable(
            name = "sucursal_empresa_insumo", // Nombre de la tabla intermedia
            joinColumns = @JoinColumn(name = "sucursal_id"), // Columna que hace referencia a Empresa
            inverseJoinColumns = @JoinColumn(name = "sucursal_insumo_id") // Columna que hace referencia a SucursalEmpresa
    )
    private List<SucursalEmpresa> sucursalInsumo = new ArrayList<>();

}
