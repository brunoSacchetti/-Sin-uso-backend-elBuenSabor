package com.example.BackEndElBuenSabor.domains.entities;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
@Builder
@Table(name = "imagen")
public class Imagen extends BaseEntidad{
    private String url;

    // IMAGEN - CLIENTE
    @OneToOne(mappedBy = "imagen")
    private Cliente cliente;

    // IMAGEN - ARTICULO
    @ManyToOne
    @JoinColumn(name = "articulo_id")
    private Articulo articulo;

    // IMAGEN - PROMOCION
    @ManyToOne
    @JoinColumn(name = "promocion_id")
    private Promocion promocion;

}
