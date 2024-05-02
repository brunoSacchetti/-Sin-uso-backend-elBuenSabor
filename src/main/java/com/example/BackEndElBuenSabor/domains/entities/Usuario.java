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
@Table(name = "usuario")
public class Usuario extends BaseEntidad{

    //@Column(unique = true)
    private String auth0Id;

    private String username;

    @OneToOne(mappedBy = "usuario")
    private Cliente cliente;

}
