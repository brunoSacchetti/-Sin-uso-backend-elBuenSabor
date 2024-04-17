package com.example.BackEndElBuenSabor.domains.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
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
@Table(name = "categoria_articulo")
public class Categoria extends BaseEntidad{
    private String denominacion;

    @OneToMany
    @JoinColumn(name = "categoria_id")
    private Set<ArticuloManufacturado> categoriaArtManufact = new HashSet<>();

    @OneToMany
    @JoinColumn(name = "categoria_id")
    private Set<ArticuloInsumo> categoriaArtInsumo = new HashSet<>();

    @OneToMany
    @JoinColumn(name = "categoria_id")
    private Set<Categoria> subCategorias = new HashSet<>();



}
