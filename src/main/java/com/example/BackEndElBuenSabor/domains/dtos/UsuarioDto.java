package com.example.BackEndElBuenSabor.domains.dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class UsuarioDto extends BaseDto{
    private String auth0Id;
    private String username;
}
