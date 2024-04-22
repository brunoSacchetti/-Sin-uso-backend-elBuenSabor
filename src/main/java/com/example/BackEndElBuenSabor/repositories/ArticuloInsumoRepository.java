package com.example.BackEndElBuenSabor.repositories;

import com.example.BackEndElBuenSabor.domains.entities.ArticuloInsumo;
import com.example.BackEndElBuenSabor.domains.entities.BaseEntidad;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArticuloInsumoRepository extends BaseRepository<ArticuloInsumo, Long> {
}
