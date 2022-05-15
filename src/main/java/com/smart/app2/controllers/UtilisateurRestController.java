package com.smart.app2.controllers;


import com.smart.app2.entities.Utilisateur;
import com.smart.app2.services.UtilisateurService;
import jdk.internal.dynalink.linker.LinkerServices;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/apiutilisateur")
public class UtilisateurRestController {

    private UtilisateurService utilisateurService;

    public UtilisateurRestController(UtilisateurService utilisateurService) {
        super();
        this.utilisateurService = utilisateurService;
    }

    @GetMapping
    public List<Utilisateur> getAllUser(){
        return utilisateurService.getAllUtilisateur();
    }

    @GetMapping("/id")
    public  Utilisateur getUserById(@PathVariable("id") Long id){
        return utilisateurService.getUtilisateurParId(id);
    }

    @DeleteMapping("/id")
     public void deleteUseById(@PathVariable("id") Long id){
        utilisateurService.deleteUtilisateur(id);
    }
    @PostMapping
    public Utilisateur addUser(@RequestBody Utilisateur utilisateur){
        return  utilisateurService.addNewUtilisateur(utilisateur);
    }
    @PutMapping("/{id}")
    public Utilisateur updateUser(@PathVariable("id") Long id,@RequestBody Utilisateur utilisateur){
        Utilisateur user= utilisateurService.getUtilisateurParId(id);
        user.setAge(utilisateur.getAge());
        user.setSexe(utilisateur.getSexe());
        user.setObjectifmacron(utilisateur.getObjectifmacron());

    return utilisateurService.updateUtilisateur(utilisateur);
    }
}
