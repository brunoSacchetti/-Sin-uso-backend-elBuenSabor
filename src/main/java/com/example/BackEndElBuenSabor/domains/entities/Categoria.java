package com.example.BackEndElBuenSabor.domains.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
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
@Table(name = "categoria_articulo")
public class Categoria extends BaseEntidad{

    private String denominacion;

    // CATEGORIA - ARTICULO
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "categoria")
    private Set<Articulo> articulos = new HashSet<>();

    // CATEGORA - CATEGORIA (RECURSIVIDAD)
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "categoriaMayor")
    @JsonIgnoreProperties("categoriaMayor")
    private Set<Categoria> subCategorias = new HashSet<>();

    @ManyToOne
    @JoinColumn(name = "categoria_mayor_id")
    @JsonIgnoreProperties("subCategorias") // no cree recursividad en relacioens bidireccionales
    private Categoria categoriaMayor;

}
