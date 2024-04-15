package com.example.BackEndElBuenSabor.domains.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;

@Entity
@Table(name = "sucursal_insumo")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class SucursalInsumo extends BaseEntidad {

    private int stockActual;

    private int stockMinimo;

    private int stockMaximo;


}