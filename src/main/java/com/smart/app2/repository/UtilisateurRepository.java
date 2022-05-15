package com.smart.app2.repository;

import com.smart.app2.entities.Utilisateur;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UtilisateurRepository extends JpaRepository<Utilisateur , Long> {
}
