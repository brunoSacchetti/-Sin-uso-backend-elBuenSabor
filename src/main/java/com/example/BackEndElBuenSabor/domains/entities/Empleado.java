package com.example.BackEndElBuenSabor.domains.entities;

import com.example.BackEndElBuenSabor.enums.Rol;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "empleado")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Empleado extends BaseEntidad{

    private String nombre;

    private String apellido;

    private String telefono;

    private String email;

    private Rol perfil;

    @OneToOne(mappedBy = "empleado")
    private Usuario usuario;



}
