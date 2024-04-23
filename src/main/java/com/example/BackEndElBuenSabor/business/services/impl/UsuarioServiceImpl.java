package com.example.BackEndElBuenSabor.business.services.impl;

import com.example.BackEndElBuenSabor.business.services.IUsuarioService;
import com.example.BackEndElBuenSabor.domains.entities.Usuario;
import org.springframework.stereotype.Service;

@Service
public class UsuarioServiceImpl extends BaseServiceImpl<Usuario,Long> implements IUsuarioService {
}
