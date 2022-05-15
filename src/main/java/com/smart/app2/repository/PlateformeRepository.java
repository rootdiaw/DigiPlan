package com.smart.app2.repository;

import com.smart.app2.entities.Plateforme;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PlateformeRepository extends JpaRepository<Plateforme, Long> {

     List<Plateforme> findByNom(String nom);

}
