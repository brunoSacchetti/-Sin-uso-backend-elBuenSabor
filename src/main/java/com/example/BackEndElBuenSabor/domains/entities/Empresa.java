package com.example.BackEndElBuenSabor.domains.entities;

import jakarta.persistence.*;
import lombok.*;
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
    @OneToMany // (cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.EAGER)
    @JoinColumn(name = "empresa_id")
    @Builder.Default
    private Set<SucursalEmpresa> sucursales = new HashSet<>();


}
