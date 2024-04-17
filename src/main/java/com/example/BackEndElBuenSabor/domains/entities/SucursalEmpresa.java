package com.example.BackEndElBuenSabor.domains.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

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

    // SUCURSAL - DOMICILIO
    @OneToOne
    @JoinColumn(name = "domicilio_id")
    private Domicilio domicilio;

    // SUCURSAL - LOCALIDAD
    // SE PUEDE COLOCAR CON JOIN COLUMN O NO, PARA name_id PERSONALIZADO
    @ManyToOne
    private Localidad localidad;

    //SE AGREGA EL JOIN COLUMN PARA QUE JPA NO CREE LA TABLA INTERMEDIA EN UNA RELACION ONE TO MANY
    //DE ESTA MANERA PONE EL FOREIGN KEY 'sucursal_id' EN LA TABLA DE LOS MANY
    // SUCURSAL - PROMOCION
    @OneToMany
    @JoinColumn(name = "sucursal_id")
    private Set<Promocion> promociones = new HashSet<>();

    // SUCURSAL - CATEGORIA
    @OneToMany
    @JoinColumn(name = "sucursal_id")
    private Set<Categoria> categorias = new HashSet<>();


}
