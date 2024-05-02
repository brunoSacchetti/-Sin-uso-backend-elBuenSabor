package com.example.BackEndElBuenSabor.domains.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.HashSet;
import java.util.Set;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
@Builder
@Table(name = "unidad_medida")
public class UnidadMedida extends BaseEntidad{

    private String denominacion;

    @OneToMany(mappedBy = "unidadMedida")
    @Builder.Default
    private Set<Articulo> articulos = new HashSet<>();

}
