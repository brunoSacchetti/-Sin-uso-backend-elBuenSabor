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
    @OneToMany(mappedBy = "categoria")
    @Builder.Default
    private Set<Articulo> articulos = new HashSet<>();

    // CATEGORA - CATEGORIA (RECURSIVIDAD)
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "categoriaMayor")
    //@JsonIgnoreProperties("categoriaMayor")
    @Builder.Default
    private Set<Categoria> subCategorias = new HashSet<>();

    @ManyToOne
    @JoinColumn(name = "categoria_padre_id")
    //@JsonIgnoreProperties("subCategorias") // no cree recursividad en relacioens bidireccionales
    private Categoria categoriaMayor;

    @ManyToMany(mappedBy = "categorias")
    @Builder.Default
    private Set<Sucursal> sucursales = new HashSet<>();

}
