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
@Table(name = "usuario")
public class Usuario extends BaseEntidad{

    private String auth0Id;

    private String username;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_empleado")
    private Empleado empleado;

    @OneToOne
    @JoinColumn(name = "fk_cliente")
    private Cliente cliente;


}
