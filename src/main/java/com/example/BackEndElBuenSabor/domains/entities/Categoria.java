package com.example.BackEndElBuenSabor.domains.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
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
@SuperBuilder
@Table(name = "categoria_articulo")
public class Categoria extends BaseEntidad{

    private String denominacion;

    // CATEGORIA - ARTICULO
    @OneToMany
    @JoinColumn(name = "categoria_id")
    @Builder.Default
    private Set<Articulo> articulos = new HashSet<>();

    // CATEGORA - CATEGORIA (RECURSIVIDAD)
    @OneToMany
    @JoinColumn(name = "categoria_id")
    private Set<Categoria> subCategorias = new HashSet<>();



}
