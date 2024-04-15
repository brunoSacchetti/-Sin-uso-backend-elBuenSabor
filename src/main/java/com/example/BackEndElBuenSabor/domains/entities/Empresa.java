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
@Table(name = "empresa")
public class Empresa extends BaseEntidad{

    private String nombre;

    private String razonSocial;

    private int cuil;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinTable(
            name = "empresa_sucursal", // Nombre de la tabla intermedia
            joinColumns = @JoinColumn(name = "empresa_id"), // Columna que hace referencia a Empresa
            inverseJoinColumns = @JoinColumn(name = "sucursal_id") // Columna que hace referencia a SucursalEmpresa
    )
    private List<SucursalEmpresa> sucursales = new ArrayList<>();

}
