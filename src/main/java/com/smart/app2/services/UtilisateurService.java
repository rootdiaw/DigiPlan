package com.smart.app2.services;

import com.smart.app2.entities.Utilisateur;

import java.util.List;

public interface UtilisateurService {

    Utilisateur addNewUtilisateur(Utilisateur utilisateur);
    Utilisateur updateUtilisateur(Utilisateur utilisateur);
    void deleteUtilisateur(Long id);
    Utilisateur getUtilisateurParId(Long id);
    List<Utilisateur> getAllUtilisateur();
}
