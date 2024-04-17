package com.example.BackEndElBuenSabor.domains.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.transaction.jta.UserTransactionAdapter;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

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

    //EMPRESA - SUCURSAL
    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.EAGER)
    @JoinColumn(name = "empresa_id")

    /*@JoinTable(
            name = "empresa_sucursal", // Nombre de la tabla intermedia
            joinColumns = @JoinColumn(name = "empresa_id"), // Columna que hace referencia a Empresa
            inverseJoinColumns = @JoinColumn(name = "sucursal_id") // Columna que hace referencia a SucursalEmpresa
    )*/
    private Set<SucursalEmpresa> sucursales = new HashSet<>();


}
