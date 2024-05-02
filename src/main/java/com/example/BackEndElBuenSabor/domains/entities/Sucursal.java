package com.example.BackEndElBuenSabor.domains.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;
import org.springframework.cglib.core.Local;

import java.time.LocalTime;
import java.util.HashSet;
import java.util.Set;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
@Builder
@Table(name = "sucursal_empresa")
public class Sucursal extends BaseEntidad {

    private String nombre;

    private LocalTime horarioApertura;

    private LocalTime horarioCierre;

    //SUCURSAL - EMPRESA
    @ManyToOne
    @JoinColumn(name = "empresa_id")
    //@JsonIgnoreProperties("sucursales") //es especialmente útil para evitar problemas de recursividad en relaciones bidireccionales y para evitar que información no deseada sea expuesta a través de APIs.
    private Empresa empresa;


    // SUCURSAL - DOMICILIO
    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "domicilio_id")
    private Domicilio domicilio;

    // SUCURSAL - CATEGORIA
    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinTable(name = "sucursal_categoria",
                joinColumns = @JoinColumn(name = "sucursal_id"),
                inverseJoinColumns = @JoinColumn(name = "categoria_id"))
    @Builder.Default
    private Set<Categoria> categorias = new HashSet<>();

    // SUCURSAL - PROMOCION
    @OneToMany(mappedBy = "sucursal", cascade = CascadeType.REFRESH, fetch = FetchType.LAZY)
    @Builder.Default
    private Set<Promocion> promociones = new HashSet<>();

    // SUCURSAL - PEDIDO
    @OneToMany(mappedBy = "sucursal")
    @Builder.Default
    private Set<Pedido> pedidos = new HashSet<>();

}
