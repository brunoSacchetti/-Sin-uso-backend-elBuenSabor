package com.example.BackEndElBuenSabor.repositories;

import com.example.BackEndElBuenSabor.domains.entities.BaseEntidad;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

import java.io.Serializable;

@NoRepositoryBean // indicamos que no debe considerarse un repositorio
public interface BaseRepository<E extends BaseEntidad, ID extends Serializable> extends JpaRepository<E, ID> {
}
